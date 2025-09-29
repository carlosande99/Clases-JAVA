package com.ipartek.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {

        //En Java, los Wildcards (?) se usan en genericos para indicar un tipo desconocido
        //Son muy útiles cuando trabajamos con clases genéricas y queremos flexibilidad
        //sin perder seguridad de tipos

        Imprimir.imprimirMensajeSimple("hola que tal");

        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Pepito"));
        listaPersonas.add(new Persona("Juanito"));

        System.out.println("=============================================================");

        Imprimir.imprimirLista(listaPersonas);

        List<Musico> listaMusicos = new ArrayList<>();

        listaMusicos.add(new Musico("Juán Valdivia", "Guitarra"));
        listaMusicos.add(new Musico("Joaquín Cardiel","Bajo"));

        listaPersonas.add(new Musico("Pedro Andreu", "Batería"));


        /*List<List<Persona>> listado = new ArrayList<>();
        listado.add(listaMusicos);*/

        //Un Musico es Persona: donde me pidan una Persona puedo mandar un Musico (polimorfismo puro)
        //Un List<Musico> es un List<Persona>? la respuesta es NO. La herencia no funciona así en genenerics
        Imprimir.imprimirLista(listaMusicos);
        Imprimir.imprimirLista(listaPersonas);

        List<Gato> listaGatos = new ArrayList<>();

        listaGatos.add(new Gato("Mizifuz"));
        listaGatos.add(new Gato("Silvestre"));

        Imprimir.imprimirLista(listaGatos);


    }
}
