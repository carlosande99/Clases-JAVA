package com.ipartek.objetos_mutables2;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        System.out.println("Está personas vacío al principio?: " + personas.isEmpty());
        miMetodo(personas);
        System.out.println("Está personas vacío al final?: " + personas.isEmpty());


    }


    public static void miMetodo(List<Persona> lasPersonas){
        System.out.println("Está lasPersonas vacío al entrar en el metodo?: " + lasPersonas.isEmpty());

        //Aquí vamos a romper el vínculo con el único objeto que está, hasta ahora, end el heap
        lasPersonas = new ArrayList<>();

        Persona manolito = new Persona("Manolito");
        Persona mafalda = new Persona("Mafalda");
        Persona miguelito = new Persona("Miguelito");

        lasPersonas.add(manolito);
        lasPersonas.add(mafalda);
        lasPersonas.add(miguelito);

        System.out.println("Está lasPersonas vacío al finalizar el metodo?: " + lasPersonas.isEmpty());

    }
}
