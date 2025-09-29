package com.ipartek.set.linkedhashset;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Principal8 {

    public static void main(String[] args) {

        //Los LinkedHashSet como Sets no admiten duplicados.
        //Pero al contrario que los HashSet almacenan los elementos
        //ordenadamente SIGUIENDO EL ORDEN NATURAL DE ENTRADA.
        //Pero no podemos hacer un post ordenamiento tal y como hacemos
        //con los list

        Set<Arbol> bosque = new LinkedHashSet<>();

        bosque.add(new Arbol("Fresno",13.0));
        bosque.add(new Arbol("Roble",10.0));
        bosque.add(new Arbol("Fresno",13.0));
        bosque.add(new Arbol("Nogal",9.0));
        bosque.add(new Arbol("Nogal",11.0));
        bosque.add(new Arbol("Cerezo",13.0));
        bosque.add(new Arbol("Cerezo",8.0));
        bosque.add(new Arbol("Almendro",3.0));
        bosque.add(new Arbol("Limonero",4.0));
        bosque.add(new Arbol("Limonero",7.0));

        bosque.forEach(System.out::println);

        //Comprobamos que el orden de entrada es respetado
        //y, como set, los elementos duplicados no son admitidos



    }
}
