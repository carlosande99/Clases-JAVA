package com.ipartek.set.buscarduplicados;

import java.util.HashSet;
import java.util.Set;

public class Principal5 {


    public static void main(String[] args) {

        //Recibimos de una BBDD un Array de String con el nombre de varias ciudades.
        //Entre esos nombres se encuentran varios que están duplicados una o varias veces
        //Se trata de crear dos Sets: uno para ciudades duplicadas y otro para ciudades no duplicadas

        //Recordemos el método add devuelve un boolean (true o false) para indicarnos si el objeto
        //que estamos intentando insertar en el Set ha sido admitido o no.

        //Sacar por consola los dos Sets con los resultados

        String[] ciudades = {"Bilbao","Bilbao","Barcelona","Bilbao","Madrid", "Sevilla","Valencia","Valencia","Valladolid","Salamanca","Salamanca","Sevilla","Santander"};

        Set<String> duplicados = new HashSet<>();
        Set<String> noDuplicados =new HashSet<>();

        for(  String ciudad   : ciudades      ){


            if(!noDuplicados.add(ciudad)){

                duplicados.add(ciudad);
            }


        }

        System.out.println("//NO DUPLICADOS///////////////////////////////////////////////");
        noDuplicados.forEach(System.out::println);
        System.out.println("//DUPLICADOS///////////////////////////////////////////////");
        duplicados.forEach(System.out::println);






    }
}
