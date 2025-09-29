package com.ipartek.objetos_inmutables;

public class Principal4 {

    public static void main(String[] args) {

        String miString = "hola";//String miString = new String("hola");
        miMetodo(miString);
        System.out.println(miString);



    }


    public static void miMetodo(String s){

        s = "adios";//Aunque da la sensación que estamos modificando
        //el objeto "s", en realidad estamos creando otro objeto..
        //porque los Strings son inmutables


    }


}
