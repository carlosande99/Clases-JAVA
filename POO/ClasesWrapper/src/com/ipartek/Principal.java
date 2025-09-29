package com.ipartek;

public class Principal {

    public static void main(String[] args) {

        ///  ///////////////////////////////////////////////////////////////////
        // BOXING
        /// ///////////////////////////////////////////////////////////////////

        //Autoboxing/////////////////////////////////////////////////////////

        Integer miWrapperInteger = 67; //Estamos convirtiendo automáticamente un int en un Integer
        //Integer miWrapper2 = new Integer(67);
        int miPrimitivoInteger = 54;

        Boolean miWrapperBoolean = true;//Estamos convirtiendo automáticamente un boolean en un Boolean
        boolean miPrimitivoBoolean = false;
        Double miWrapperDouble = 23456.789;//Estamos convirtiendo automáticamente un double en un Double
        Long miWrapperLong = 754757757575L;//Estamos convirtiendo automáticamente un long en un Long
        Float miWrapperFloat = 8765.789F;//Estamos convirtiendo automáticamente un float en un Float

        //Pero tenemos que tener en cuenta el valor que le pasamos...
        //Short miWrapperShort = 65465757509090;//No podemos meter un número tan grande en un variable tan pequeña
        //Double miWrapperDouble2 = true;//Son tipos incompatibles

        //boxing manual ///////////////////////////////////////////////////////////////////////

        Integer miWrapperInteger2 = Integer.valueOf(23);//Esto no tiene sentido porque lo podemos hacer de una manera
        //mucho mas sencilla utilizando el autoboxing visto anteriormente...
        Integer miWrapperInteger3 = Integer.valueOf("23");//De una BBDD pueden llegar valore numéricos con formato String

        Double miWrapperDoouble4 = Double.valueOf(2345.67);
        Double miWrapperDoouble5 = Double.valueOf("2345.67");


        ///  ///////////////////////////////////////////////////////////////////
        // UNBOXING
        /// ///////////////////////////////////////////////////////////////////

        //AutoUnboxing (el objeto pierde sus propiedades y métodos

        int miPrimitivoInt = miWrapperInteger;//67
        boolean miPrimitivoBoolean2 = miWrapperBoolean;//true


        //Unboxing manual//////////////////////////////////////////////////////////////////

        int miPrimitivoInt2 = miWrapperInteger.intValue();
        boolean miPrimitivoBoolean3 = miWrapperBoolean.booleanValue();



        /// ////////////////////////////////////////////////////////////
        //LOS WRAPPERS SON OBJETOS INMUTABLES!!!!!!!
        /// ////////////////////////////////////////////////////////////



        /// ///////////////////////////////////////////////////////////
        //COMPARACIÓN ENTRE WRAPPERS
        /// ///////////////////////////////////////////////////////////

        //Ojo con el "integer catching". Al comparar dos números (wrappers) comprendidos entre -128 y 127  (8 bits) 
        //nos puede dar la falsa sensación de que utilizando el == funciona correctamente con todos los valores
        //pero no es asi. 
        
        Integer miInteger = 127;
        Integer miInteger2 = 127;
        
        String resultadoDeLaComparacion = (miInteger == miInteger2) ? "son iguales" : "son diferentes";
        System.out.println("resultadoDeLaComparacion = " + resultadoDeLaComparacion);//son iguales

        //Cuando comparamos dos objetos Wrapper con "==" funciona la lógica de los primitivos hasta los 8 bits
        //pero a partir de ahí no.

        ///  ///////////////////////////////////////////////////////////////////////////////////////////////
        //PARA COMPARAR WRAPPERS DEBEMOS UTILIZAR SIEMPRE EQUALS
        /// ////////////////////////////////////////////////////////////////////////////////////////////////








    }




}
