package com.ipartek.list.arraylist;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {


        //Los ArrayList permiten elementos duplicados
        //Siempre que creemos un ArrayList lo vamos a hacer contra su Interface List (polimorfismo de asignación)
        //Esto es porque si observamos el árbol de herencia de List en el JDK, los ArrayList heredan todos
        //los métodos de List y a  no tener ningún método propio no los pierde y gana polimorfismo

        List<Arbol> bosque = new ArrayList<>();

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

        //Un ArrayList tiene un orden natural de entrada:

        bosque.forEach(System.out::println);


        System.out.println("===============================================================");

        //Para que un tipo propio  (por ejemplo Arbol) se pueda ordenar
        //en un List según algún criterio tenemos que cumplir SOLO UNA REGLA:
        //que el tipo Arbol implemente la interface Comparable.
        //La interface Comparable tiene un solo método "CompareTo"
        //Dentro del JDK existen inmumerables clases que llevan implementada
        //la interface Comparable: por ejemplo la clase String

        //Para hacer un post ordenamiento vamos a utilizar la clase helper del
        //Collection Framework llamado Collections

        Collections.sort(bosque);


        bosque.forEach(System.out::println);
        
        //En el ejemplo anterior el método sort está utilizando el método "compareTo" de la clase Arbol
        //"por debajo" para realizar el ordenamiento, pero no olvidemos que el el método "compareTo"
        //es un método normal y corriente que puede ser utilizado por cualquier instancia de Arbol...
        
        Arbol melocotonero = new Arbol ("Melocotonero", 5.0);
        Arbol secuoya = new Arbol ( "Secuoya",100.0);
        
        int resultado = melocotonero.compareTo(secuoya);


        System.out.println("===============================================================");

        System.out.println("resultado = " + resultado);//-95


        /// //////////////////////////////////////////////////////////////////////////////////
        //MÉTODOS DE LOS ARRAYLIST COMPARTIDOS CON LOS LINKEDLIST
        /// //////////////////////////////////////////////////////////////////////////////////

        //size
        //Devuelve el número de elementos de un List
        int numeroArboles = bosque.size();
        System.out.println("numeroArboles = " + numeroArboles);//10

        //isEmpty
        //Devuelve un booleano: tue si está vacío y false si tiene al menos un elemento
        boolean resultado2 = bosque.isEmpty();
        System.out.println("resultado2 = " + resultado2);//false

        //forEach
        //Itera uno a uno todos los elementos de un List
        //Ver ejemplos anteriores...

        //set
        //Permite añadir un elemento en una posición deseada
        //REEMPLAZANDO el elemento que se encontraba en dicha posición.
        //Por lo tanto ese elemento se elimina del List.
        //El método devuelve además la referencia del elemento eliminado

        Arbol miPino = new Arbol("Pino",20.0);
        Arbol arbolEliminado = bosque.set(6,miPino);
        System.out.println("arbolEliminado = " + arbolEliminado);


        System.out.println("===============================================================");

        bosque.forEach(System.out::println);


        //contains
        //Nos informa si un objeto determinado se encuentra en el List
        System.out.println("¿Está en el List un arbol llamado elPino?: " + (bosque.contains(miPino) ? "si" : "no"));


        //romove
        //Eliminia de un List un objeto de un determinado índice (comenzamos por 0)
        //Devuelve el objeto eleiminado

        Arbol arbolEliminado2 = bosque.remove(0);

        System.out.println("arbolEliminado2 = " + arbolEliminado2);

        System.out.println("===============================================================");

        bosque.forEach(System.out::println);
        
        
        //toArray
        //Convierte un ArrayList en un Array con todos sus elementos...
        
        Arbol[] elArrayBosque = bosque.toArray(new Arbol[0]);
        Object[] elArrayObjetos = bosque.toArray();
        
        //get
        //Devuelve el objeto seleccionado por su índice, pero no lo elimina del List
        Arbol elArbolElegido = bosque.get(4);
        System.out.println("elArbolElegido = " + elArbolElegido);


        //indexOf
        //Devuelve el índice (no el objeto) del objeto pasado como argumento

        int indice = bosque.indexOf(miPino);
        System.out.println("indice = " + indice);//5


    }



}
