package com.ipartek.map.linkedhashmap;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Principal14 {

    public static void main(String[] args) {

        //Si necesitamos un Map en el que lo importante sea guardar el orden de entrada
        //un LinkedHashMap sería lo ideal

        Map<Integer,String> nombres = new LinkedHashMap<>();

        nombres.put(10,"Pepito");
        nombres.put(5,"Juanito");
        nombres.put(1,"Jorgito");
        nombres.put(3,"Andresito");
        nombres.put(34,"Jaimito");
        nombres.put(123,"Joselito");
        nombres.put(249,"Romualdito");

        //Como vemos se respeta el orden de entreda
        nombres.forEach(   (numero,nombre)->System.out.println(nombre + " es el número " + numero)  );




    }
}
