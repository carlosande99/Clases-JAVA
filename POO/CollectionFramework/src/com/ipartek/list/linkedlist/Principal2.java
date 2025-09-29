package com.ipartek.list.linkedlist;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        //En esta ocasión, con los LinkedList, no vamos a emplear el polimorfismo
        //de asignación utilizando la interface List.
        //Por lo tanto emplearemos la clase propia para crear el objeto (sin disfraz)
        //La razón es que si empleamos el objeto "bosque" como List no tendríamos
        //acceso a ciertos métodos propios de los LinkedList  ( y que no tienen los ArrayList)
        //y que son precisamente los que los diferencian de los ArrayList

        LinkedList<Arbol> bosque = new LinkedList<>();
        LinkedList<Arbol> bosque2 = new LinkedList<>();


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

        Arbol mandarino = new Arbol("Mandarino",4.0);

        bosque.forEach(System.out::println);;

        //Comprobamos que en un LinkedList prevalece el orden de entrada natural
        //exactamente igual que en los Array List

        /// ////////////////////////////////////////////////////////////////////////////////
        //MÉTODOS PROPIOS DE LOS LINKEDLIST QUE NO TIENEN LOS ARRAYLIST
        /// ////////////////////////////////////////////////////////////////////////////////

        //addFirst
        //Añade un elemento al principio de la lista
        bosque.addFirst(mandarino);

        System.out.println("=================================================================");

        bosque.forEach(System.out::println);;
        
        //addLast
        //Añade un elemento al final de la lista (hace lo mismo que el método add)
        
        
        //getFist
        //Devuelve una referencia del primer elemento de la lista (no lo elimina)
        
        Arbol primerArbol = bosque.getFirst();
        System.out.println("primerArbol = " + primerArbol);

        //En caso de no encontrarlo
        //Arbol primerArbol2 = bosque2.getFirst();//NoSuchElementException


        //getLast
        //Devuelve una referencia del último elemento de la lista (no lo elimina)

        Arbol ultimoArbol = bosque.getLast();
        System.out.println("ultimoArbol = " + ultimoArbol);

        //En caso de no encontrarlo
       //Arbol ultimoArbol2 = bosque2.getLast();//NoSuchElementException


        //peekFirst
        //Devuelve una referencia del primer elemento de la lista (no lo elimina)
        //En caso de no encontrarlo deuelve null. No lanza ninguna excepción.

        Arbol primerArbol2 = bosque.peekFirst();
        System.out.println("primerArbol2 = " + primerArbol2);

        Arbol primerArbol3 = bosque2.peekFirst();//null
        System.out.println("primerArbol3 = " + primerArbol3);


        //peekLast
        //Devuelve una referencia del último elemento de la lista (no lo elimina)
        //En caso de no encontrarlo deuelve null. No lanza ninguna excepción.

        Arbol ultimoArbol2 = bosque.peekLast();
        System.out.println("ultimoArbol2 = " + ultimoArbol2);

        Arbol ultimoArbol3 = bosque2.peekLast();//null
        System.out.println("ultimoArbol3 = " + ultimoArbol3);


        //peek
        //Hace exactamene lo mismo que el peekFirst



        /// //////////////////////////////////////////////////////////////////////////////
        //MÉTODOS DE ELIMINACIÓN
        //La eliminación de un elemento desplaza los elementos siguientes hacia la izquierda:
        //resta 1 a todos los índices desde la posición del elemento eliminado excepto si
        //eliminamos el último
        /// //////////////////////////////////////////////////////////////////////////////

        //removeFirst
        //Devuelve una refeencia del primer elemento pero además este elemento queda eliminado (borrado)
        //del Linked List . Si no lo encuentra lanza la excepción "NoSuchElementException"

        Arbol arbolEliminado = bosque.removeFirst();

        //Arbol arbolEliminado2 = bosque2.removeFirst();//NoSuchElementException



        //removeLast
        //Devuelve una refeencia del último elemento pero además este elemento queda eliminado (borrado)
        //del Linked List . Si no lo encuentra lanza la excepción "NoSuchElementException"

        Arbol arbolEliminado4 = bosque.removeLast();

        //Arbol arbolEliminado5 = bosque2.removeLast();//NoSuchElementException


        //remove
        //Devuelve una referencia del elemento especificado del índice pasado como argumento
        //y además el elemento queda eliminado del LinkedList
        //Si no lo encuentra lanza la excepci: "IndexOutOfBoundException"

        Arbol arbolEliminado5 = bosque.remove(5);
        System.out.println("arbolEliminado5 = " + arbolEliminado5);

        //Esta sobrecarga, en la que no pasamos ningún argumento, elimina el primer
        //elemento de la lista (actua igual que el removeFirst)
        //En el caso de no encontrar el primer elemento lanza la excepción "NoSuchElementException"

        Arbol arbolEliminado6 = bosque.remove();

        //Tiene una tercera sobrecarga en la que el método nos pide un Objeto.
        //Para comprobar su funcionamiento vamos a incluir en el LinkedList
        //un árbol y después lo vamos a eliminar...

        Arbol ciruelo = new Arbol ("Ciaruelo",4.0);

        bosque.add(6,ciruelo);

        System.out.println("=================================================================");

        bosque.forEach(System.out::println);;

        bosque.remove(ciruelo);

        System.out.println("=================================================================");

        bosque.forEach(System.out::println);;


        //pollFirst y poll
        //Estos métodos devuelven una referencia del primer elemento y éste queda borrado
        //del LinkedList (igual que el removeFirst)
        //¿Dónde radica la diferencia? : en el caso de no encontrar el elemento, no lanza
        //una excepción, devuelve null

        Arbol arbolEliminado7 = bosque.pollFirst();
        Arbol arbolEliminado8 = bosque2.pollFirst();//null


        //pollLast
        //Este método devuelve una referencia del ùltimo elemento y éste queda borrado
        //del LinkedList (igual que el removeLast)
        //¿Dónde radica la diferencia? : en el caso de no encontrar el elemento, no lanza
        //una excepción, devuelve null

        Arbol arbolEliminado9 = bosque.pollLast();
        Arbol arbolEliminado10 = bosque2.pollLast();//null


        //pop (igual que el rmoveFirst)
        //Devuelve una referencia del primer elemento y además este elemento queda eliminado
        //del LinkekList. Si no lo encuentra lanza la excección "NoSuchElementoExecption"



    }
}
