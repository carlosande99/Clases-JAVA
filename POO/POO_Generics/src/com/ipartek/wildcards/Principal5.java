package com.ipartek.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal5 {

    public static void main(String[] args) {


        //En Java, los Wildcards (?) se usan en genericos para indicar un tipo desconocido
        //Son muy útiles cuando trabajamos con clases genéricas y queremos flexibilidad
        //sin perder seguridad de tipos

        //Cuando craamos un Array List mediante List.of el objeto resultante es inmutable
        List<Perro> perros = List.of(new Perro("Fifí"),new Perro("Dientitos"),new Perro("Luna"));

        //perros.add(new Perro("Pepito"));

        List<Gato> gatos = List.of( new Gato("Mizifuz"),new Gato("Silvestre"), new Gato("Zafirón"));

        List<Perro> perros2 = new ArrayList<>(); //Este objeto es mutable
        perros2.add(new Perro("Jaimito"));
        perros2.add(new Perro("Firulais"));

        List<Gato> gatos2 = new ArrayList<>(); //Este objeto es mutable
        List<Animal> animales = new ArrayList<>(); //Este objeto es mutable

        animales.add(new Gato("Felix"));
        animales.add(new Perro("Juanito"));
        animales.add(new Animal("un animal"));

        List<Musico> musicos = new ArrayList<>();
        musicos.add(new Musico("Ritchie Blackmore","Guitarra"));
        musicos.add(new Musico("David Gilmour","Guitarra"));


        Utilidades2.animalesEmitiendoSonidos(perros);

        System.out.println("========================================================");

        Utilidades2.animalesEmitiendoSonidos(gatos);

        System.out.println("========================================================");

        Utilidades2.animalesEmitiendoSonidos(animales);

        System.out.println("========================================================");

        //Utilidades2.animalesEmitiendoSonidos(musicos);

        Utilidades2.agregarPerros(perros2);
        Utilidades2.agregarPerros(gatos2);
        Utilidades2.agregarPerros(animales);

        System.out.println("========================================================");

        Utilidades2.animalesEmitiendoSonidos(perros2);
    }


}
