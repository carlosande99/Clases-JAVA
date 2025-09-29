package com.ipartek.primitivos;

public class Principal1 {

    public static void main(String[] args) {
        /// ////////////////////////////////////////////////////////////////////////
        //CASTING AUTOMÁTICO
        /// ///////////////////////////////////////////////////////////////////////
        //Para que el casting automático suceda hacen falta dos premisas:
        //1) Tipos compatibles (todos los tipos numéricos PRIMITIVOS son compatibles entre si)
        //El tipo char es compatible con todos los tipos numéricos primitivos pero no admite el
        //casting automático. El tipo boolean no es compatible con ningún otro primitivo.
        //2) Solo puede suceder cuando se hace de un tipo más pequeño a un tipo mas grande (ver ficha)

        //En estos ejemplos se dan las dos premisas:

        int i = 100;

        //vamos a hacer un casting automático de int a float
        
        float f = i; //casting automático
        System.out.println("f = " + f);//100.0
        
        //vamos a hacer un castin automático de int a long
        
        long l = i; //casting automático
        System.out.println("l = " + l);//100
        
        //Vamos a intentar hacer un casting automático de int a char (son compatibles)
        //char ch = i;//Java no nos deja hacer el casteo automáticamente 
        //sin embargo si que podemos hacer un casteo manual:
        char ch = (char)i;//CASTING MANUAL!!!
        System.out.println("ch = " + ch);//'d'. El punto de código del caracter 'd' es U+0064. El número 0064 es 100 en base 16
        //Podemos efectuar cualquier casting (no automático) entre cualaquier número primitivo y char
        
        //Qué no podemos hacer
        int miEntero = 169;
        //boolean miBoolean = miEntero;//no podemos hacer este casteo porque boolean es incompatible con todos los demás tipos primitivos
        //boolean miBoolean = (boolean)miEntero; //Tampoco se puede porque son incompatibles

        /// ////////////////////////////////////////////////////////////////////////
        //CASTING MANUAL
        /// ///////////////////////////////////////////////////////////////////////
        //Si queremos hacer un casting de un tipo mas grande a un tipo más pequeño (siempre y cuando sean compatibles)
        //debemos hacerlo manualmente
        //Tenemos que ser cuidadosos para que no se produzcan pérdidas de datos por rango insuficiente en el nuevo tipo
        //EN OCASIONES JAVA NO TE AVISA DE ESA PÉRDIDA DE DATOS!!!. ES EL PROGRAMADOR QUIEN ASUME LA RESPONSABILIDAD
        
        //Vamos a ver un caso práctico de pérdida de datos...
        double miDouble  = 7648474849484940404000404040.854748848498;
        //vamos a pasar este dato a long
        long miLong = (long)miDouble;
        System.out.println("miLong = " + miLong);//9223372036854775807
        //NO UTILIZAR NUNCA EL CASTEO PARA REDONDEAR NÚMEROS!!!!! PARA ELLO JAVA DISPONE DE LA CLASE MATH
        
        //vamos a ver un caso en el que el casteo automático no se produce
        //Java nos permite hacerlo pero con resultados desastrosos
        
        int miInt = 1999998766;
        short miShort = (short)miInt;
        System.out.println("miShort = " + miShort);//-28882
        
        //vamos a intentar utilizar el casting para efectuar un redondeo...
        float miFloat = 564536.756F;
        int miInt3 = (int)miFloat;
        System.out.println("miInt3 = " + miInt3);//564536. Esto es un falso positivo!!! ya hemos visto en un ejemplo anterior que no funciona en todos los casos
        //NO UTILIZAR NUNCA EL CASTEO PARA REDONDEAR NÚMEROS!!!!! PARA ELLO JAVA DISPONE DE LA CLASE MATH
        


    }
}
