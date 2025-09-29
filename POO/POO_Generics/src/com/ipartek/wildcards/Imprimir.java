package com.ipartek.wildcards;

import java.util.List;

public class Imprimir {


    public static void imprimirMensajeSimple(String elMensaje){

        System.out.println(elMensaje);
    }

    public static void imprimirLista(List<?> laLista){

        //laLista.add(new Musico("Enrique Bunbury","Cantante"));//no podemos escribir

        laLista.forEach(System.out::println);//la lectura la hace perfectamente
    }

    /*public static void imprimirLista2(List<Musico> laLista){

        laLista.forEach(System.out::println);
    }*/


}
