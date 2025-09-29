package com.ipartek;

import java.util.ArrayList;
import java.util.List;

public class Principal56 {

    public static void main(String[] args) {

     /*String resultasdo =DiasSemana.LUNES.esFinDeSemana() ? "Es fin de semana" : "No es fin de semana";

     System.out.println("resultasdo = " + resultasdo);*/




       /*int resultado4 = OperacionMatematica.MULTIPLICAR.aplicar(3,7);
        System.out.println(resultado4);*/

        /*Orco urk = new Orco ("Urk");

        urk.metodoNoStaticOrco();//un objeto (this) tiene acceso al constexto no static
        urk.metodoStaticOrco();//un objeto (this) puede forzar la llamada al contexto static (PERO ES UNA PRÀCTICA NEFASTA!!!)

        //Orco.metodoNoStaticOrco();
        Orco.getnOrcos();

        Orco.metodoStaticOrco();*/


        System.out.println( ColorAutomovil.AMARILLO.metodoColorAutomovi() );
        //En un principio podemos pensar que ColorAutomovil.AMARILLO puede llamar a un método no static creyendo que al se Static no puede hacerse.
        //Pero tenemos que pensar que ColorAutomovil.AMARILLO ES UNA REFERENCIA A UN OBJETO por lo tanto pertenece al contexto no static y es
        //legal hacer esa llamada

        Automovil miAutomovil = new Automovil(ColorAutomovil.AMARILLO,Fabricante.PORSCHE, "911");
        Automovil miAutomovil2 = new Automovil(ColorAutomovil.AZUL,Fabricante.FERRARI,"Testarrossa");

        List<Automovil> concesionario = new ArrayList<>();
        concesionario.add(miAutomovil);
        concesionario.add(miAutomovil2);

        //Vamos a sacar el listado de los automóviles que hay en el concesionario
        //for tradicional

        /*for( Automovil item  :  concesionario  ){

            System.out.println(item);

        }*/

        //Vamos a sacar el listado utilizando programación funcional:
        //forEach es un método que tienen todas las colecciones

        //concesionario.forEach(   item -> System.out.println(item)   );

        //concesionario.forEach(System.out::println);//Método referencia


        /// ////////////////////////////////////////////////////////////////////////
        //MÉTODOS MÁS UTILIZADOS CON LOS ENUMERADORES
        /// ////////////////////////////////////////////////////////////////////////
        //Estos métodos descritos a continuación son heredados de la clase Enum

        //Como podemos crear una referencia en el stack de una instancia (de la clase ColorAutomovil)
        Fabricante elFabricantePorsche = Fabricante.PORSCHE;
        ColorAutomovil elColorBlanco = ColorAutomovil.BLANCO;
        Automovil automovil3 = new Automovil(elColorBlanco,elFabricantePorsche,"GT");
        concesionario.add(automovil3);
        concesionario.forEach(System.out::println);

        /*List<Persona> departamento = new ArrayList<>();
        Persona pepito = new Persona();
        Persona juanito = new Persona();

        departamento.add(pepito);
        departamento.add(juanito);
        departamento.add(new Persona());*/

        System.out.println("===============================================================");

        //Método name
        //Devuelve un String con el nombre de la constante (el nombre del objeto)
        System.out.println(elFabricantePorsche.name());
        System.out.println(elColorBlanco.name());


        System.out.println("=====================================================");

        //Método values (método static)
        //Devuelve un array con los objetos del enumerador
        Fabricante[] valores = Fabricante.values();

        //Los arrays NO TIENEN EL MÉTODO FOREACH

        for (  Fabricante elFabricante : valores   ){

            //System.out.println(elFabricante.getNombre());//Ferrari,S.E.A.T.,Porsche
            System.out.println(elFabricante);//FERRARI,SEAT,PORSCHE
        }
        
        //Método ordinal
        //Devuelve un entero que corresponde que corresponde a la posición en la que está declarado
        //el objeto en el enumerador (empezando por 0)
        
        int posicionEnLaQueEstaDeclaradoFerrari = Fabricante.FERRARI.ordinal();
        System.out.println("posicionEnLaQueEstaDeclaradoFerrari = " + posicionEnLaQueEstaDeclaradoFerrari);
        
        Fabricante elFabricanteSEAT = Fabricante.SEAT;
        
        int posicionEnLaQueEstaDeclaradoSEAT = elFabricanteSEAT.ordinal();
        System.out.println("posicionEnLaQueEstaDeclaradoSEAT = " + posicionEnLaQueEstaDeclaradoSEAT);


        //Método toString
        //Este método no corresponde a la clase Enum. Está sobreescrito en la clase Object para todos
        //los enumeradores. Funciona exactamente igual que el método name

        System.out.println(elFabricanteSEAT.toString());//SEAT


        /// //////////////////////////////////////////////////////////////////////
        //EN ESTE EJERCICIO VAMOS A CREAR UNA CALCULADORA  UTILIZANDO
        //INTERFACES Y ENUMERADORES
        // ICalculadora (interface)
        // Operacion (enumerador)
        //Calculo(clase)

        Calculo sumar = new Calculo(456,765,Operacion.SUMAR);
        Calculo restar = new Calculo ( 765,543,Operacion.RESTAR);

        sumar.calcular();
        restar.calcular();



    }

}
