package com.ipartek.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Principal13 {

    public static void main(String[] args) {

        //En los objetos de tipo TreeMap tenemos que tener un criterio de pre ordenamiento (igual que los TreeSet)
        //El criterio de pre ordenamiento tiene que estar que estar definido en la clase K (Comparable)
        //También puede estar definido en su constructor (Comparator)

        //Si utilizamos clases inmutables (String, Wrappers...) como Key tenemos garantizado que
        //esas clases ya llevan implementada la interface Comparable
        //No obstante si necesitamos el criterio de ordanación de estas clases (criterio que ya está
        //definado con la implementación de compareTo) podemos utilizar Comparator con su método compare

        Map<Integer,String> nombres = new TreeMap<>(Comparator.reverseOrder());

        nombres.put(10,"Pepito");
        nombres.put(5,"Juanito");
        nombres.put(1,"Jorgito");
        nombres.put(3,"Andresito");
        nombres.put(34,"Jaimito");
        nombres.put(123,"Joselito");
        nombres.put(249,"Romualdito");

        //Por defecto el criterio de ordenación será el establecido en el metodo compareTo de la clase Integer (que es la K)ç+ç

        nombres.forEach(   (numero,nombre)->System.out.println(nombre + " es el número " + numero)  );





    }
}
