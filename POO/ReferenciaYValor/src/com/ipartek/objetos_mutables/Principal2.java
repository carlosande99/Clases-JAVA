package com.ipartek.objetos_mutables;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        //Los array list son mutables. Son colecciones que admiten duplicados
        List<Gato> gatos = new ArrayList<>();
        List<Gato> gatos2 = gatos;
        System.out.println("Está gatos vacío? " + gatos.isEmpty());
        miMetodo(gatos);
        System.out.println("Está gatos vacío despues de la llamada al método? " + gatos.isEmpty());
        System.out.println("Está gatos2 vacío despues de la llamada al método? " + gatos2.isEmpty());

        System.out.println(gatos);
        System.out.println("============================================================");
        System.out.println(gatos2);

    }


    public static void miMetodo(List<Gato> misGatos){

        Gato mizifuz = new Gato("Mizifuz");
        Gato zafiron = new Gato("Zafirón");
        Gato silvestre = new Gato("Silvestre");

        misGatos.add(mizifuz);
        misGatos.add(zafiron);
        misGatos.add(silvestre);


    }





}
