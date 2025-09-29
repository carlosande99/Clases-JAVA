package com.iparttek;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Principal {


    /// /////////////////////////////////////////////////////////////////////////////////////
    //API Time del JDK (Java.time)
    /// ////////////////////////////////////////////////////////////////////////////////////

    //El paquete Java.time incluye muchas clases especializadas en el tratamiento de fechas.
    //Se incluyó en Java 8 en el año 2014...y fue diseñado para "reemplazar" las clases
    //"Date" y "Calendar" ya que estas tenían muchas limitaciones y eran propensas a errores.

    /// ////////////////////////////////////////////////////////////////////////////////////

    //Las clases mas utilizadas son:
    //LocalDate: representa fechas sin hora
    //LocalTime: representa horas
    //LocalDateTime: combina las dos anteriores

    /// ////////////////////////////////////////////////////////////////////////////////////

    /// ////////////////////////////////////////////////////////////////////////////////////
    //CREANDO FECHAS CON JAVA TIME
    /// ////////////////////////////////////////////////////////////////////////////////////

    //Las clases anteriores carecen de constructores públicos y se instancias con métodos
    //métodos factory (now y of son static):

    //1) now :  crea instancias a partir de la fecha y hora actual
    //2) of : construye fechas y horas a partir de las partes de una fecha
    //3) with : modifica la fecha a partir de un parámetro
    //TODOS ESTOS MÉTODOS GENERAN OBJETOS INMUTABLES


    /// ////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {

        //UTILIZANDO EL MÉTODO now
        LocalDate laFechaHoy = LocalDate.now();
        System.out.println("laFechaHoy = " + laFechaHoy);//2025-09-19

        LocalTime laHoraActual = LocalTime.now();
        System.out.println("laHoraActual = " + laHoraActual);//10:18:39.673748
        
        LocalDateTime laFechaYHoraActual = LocalDateTime.now();
        System.out.println("laFechaYHoraActual = " + laFechaYHoraActual);//2025-09-19T10:20:04.816554500
        
        //UTILIZANDO EL MÉTODO of
        LocalDate miFecha = LocalDate.of(2000,4, 8);
        System.out.println("miFecha = " + miFecha);//2000-04-08
        
        LocalDate miFecha2 = LocalDate.of(2000, Month.APRIL,8);
        System.out.println("miFecha2 = " + miFecha2);//2000-04-08
        
        
        LocalTime miHora = LocalTime.of(12,43,56);
        System.out.println("miHora = " + miHora);//12:43:56
        
        
        LocalDateTime miFechaYHora = LocalDateTime.of(miFecha2,miHora);
        System.out.println("miFechaYHora = " + miFechaYHora);//2000-04-08T12:43:56


        LocalDateTime fechaDescubrimientoAmerica = LocalDateTime.of(1492,Month.OCTOBER,12,12,45,45);
        System.out.println("fechaDescubrimientoAmerica = " + fechaDescubrimientoAmerica);//1492-10-12T12:45:45

        
        //UTILIZANDO EL MÉTODO WITH
        
        LocalDate fechaOriginal = LocalDate.of(2025,9,19);
        //Debemos recordar que las fechas de la API Time SON INMUTABLES!
        
        //Creamos una nueva fecha cambiando año, mes y día
        LocalDate  nuevaFecha = fechaOriginal.withYear(2030).withMonth(10).withDayOfMonth(1);
        System.out.println("nuevaFecha = " + nuevaFecha);//2030-10-01

        //Podemos modificar solo uno de los datos con el método with

        LocalDate nuevaFecha2 = fechaOriginal.with(Month.AUGUST);
                
        //¿Qué sucede si intentamos pasar una fecha incorrecta a un método factory?: se producirá
        //una excepcione "DateTimeExcecption"

        //LocalDate fechaIncorrecta = LocalDate.of(2024,30,45);//DateTimeException
        
        
        //Podemos extraer cualquier parte de una fecha o de una hora a través de los métodos "get"
        //que tienen los objetos de estas clases...
        
        LocalDate miFechaHoy2 = LocalDate.now();
        //Queremos extraer el mes de esta fecha
        Month elMes = miFechaHoy2.getMonth();
        System.out.println("elMes = " + elMes);//SEPTEMBER
        DayOfWeek elDia = miFechaHoy2.getDayOfWeek();
        System.out.println("elDia = " + elDia);//FRIDAY
        
        LocalDate fechaNacimientoLennon = LocalDate.of(1940,Month.OCTOBER,9);
        DayOfWeek diaSemanaNacimientoLennon = fechaNacimientoLennon.getDayOfWeek();
        System.out.println("diaSemanaNacimientoLennon = " + diaSemanaNacimientoLennon);//WEDNESDAY


        //OBTENER FECHAS Y HORAS A PARTIR DE OTRAS
        //Tenemos infinidad de métodos
        
        //Con LocalDate...
        //plusDays y minusDays : sumamos o restamos dias a la fecha
        //plusWeeks y minusWeeks
        //plusMonths y minusMonths
        //plusYears y minusMonths
        
        LocalDate fechaDeNacimientoDeLennonMasOchoSemanas = fechaNacimientoLennon.plusWeeks(8);
        System.out.println("fechaDeNacimientoDeLennonMasOchoSemanas = " + fechaDeNacimientoDeLennonMasOchoSemanas);

        //Con LocalTime...
        //plusSeconds y minusSeconds
        //plusMinutes y minusMinutes
        //plusNanos y minusNanos
        //plusHours y minusHours
        
        LocalTime horaActual = LocalTime.now();
        LocalTime horaActualMas300minutos = horaActual.plusMinutes(300);
        System.out.println("horaActualMas300minutos = " + horaActualMas300minutos);//16:13:45.753740600
        
        //Calcular la fecha y la hora hace 32 horas
        LocalDateTime horaYFechaActual = LocalDateTime.now();
        
        LocalDateTime horaYFechaActualHace32Horas = horaYFechaActual.minusHours(32);
        System.out.println("horaYFechaActualHace32Horas = " + horaYFechaActualHace32Horas);//2025-09-18T03:16:42.567542200
        
        
        //PARSEANDO FECHAS
        //Es común tener que interpretar fechas a partir de cadenas de texto provinientes de un BBDD
        //La clase java.time nos ofrece el método static sobrecargado "parse" que se ocupa de esta taréa:
        //1) La primera sobrecarga recibe únicamente una cadena a interpretar
        //2) La segunda sobrecarga añade un FORMATEADOR especializado si lo necesitamso
        
        //Utilizando la primera sobrecarga...
        String laFecha = "2025-07-06";//formato correcto
        
        LocalDate laFechaParseada = LocalDate.parse(laFecha);
        System.out.println("laFechaParseada = " + laFechaParseada);//2025-07-06

        //Vamos a utilizar la segunda sobrecarga...
        String laFechaConFormatoIncorrecto = "12/11/25";//no llega en formato correcto
        LocalDate laFecha2Parseada = LocalDate.parse(laFechaConFormatoIncorrecto, DateTimeFormatter.ofPattern("d/M/yyyy"));//Puede dar un DateTimeParseException
        System.out.println("laFecha2Parseada = " + laFecha2Parseada);//2025-11-12
        
        
        
        



    }














}
