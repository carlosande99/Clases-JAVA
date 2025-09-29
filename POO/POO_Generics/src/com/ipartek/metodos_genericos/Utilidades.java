package com.ipartek.metodos_genericos;

public class Utilidades {

    //ES RESEÑABLE QUE LA CLASE Utilidades NO ES GENÉRICA
    //AQUÍ PODEMOS VER CLARAMENTE QUE UNA CLASE NO GENÉRICA
    //PUEDE TENER MÉTODS GENÉRICOS

    public static <T> void imprimirArray( T[] elArray){

        for(  T item    :  elArray    ){
            System.out.println(item);
        }


    }

    /*public static void imprimirArrayString(String[] elArray){

        for(  String s    :  elArray    ){
            System.out.println(s);
        }
    }

    public static void imprimirArrayEnteros(Integer[] elArray){

        for(  Integer s    :  elArray    ){
            System.out.println(s);
        }
    }*/





}
