package com.ipartek.set.treeset_ordenar_datos;

import javax.swing.tree.TreePath;
import java.util.*;

public class Principal11 {

    public static void main(String[] args) {

        //Recibimos de una BBDD un ArrayList con datos
        //y queremos limpiarlo de duplicados y ordenarlo
        //en una sola operación

        List<String> equipos = new ArrayList<>();

        equipos.add("Athletic Club");
        equipos.add("Liverpool");
        equipos.add("Liverpool");
        equipos.add("Athletic Club");
        equipos.add("Manchester United");
        equipos.add("Sevilla CF");
        equipos.add("Real Betis");
        equipos.add("Sevilla CF");
        equipos.add("Real Madrid");
        equipos.add("Real Celta de Vigo");
        equipos.add("Manchester United");
        equipos.add("Real Madrid");

        Set<String> equiposSinDuplicados = new HashSet<>(equipos);

        equiposSinDuplicados.forEach(System.out::println);

        System.out.println("==========================================================");

        Set<String> equiposOrdenadosSinDuplicados = new TreeSet<>(equipos);

        equiposOrdenadosSinDuplicados.forEach(System.out::println);

        System.out.println("==========================================================");

        Set<String> equiposOrdenadosInversamenteSinDuplicados = new TreeSet<>(Comparator.reverseOrder());

        //Método addAll
        //Inserta en un Set o en List (una colección) los elementos de otra colección
        equiposOrdenadosInversamenteSinDuplicados.addAll(equipos);
        equiposOrdenadosInversamenteSinDuplicados.forEach(System.out::println);

    }
}
