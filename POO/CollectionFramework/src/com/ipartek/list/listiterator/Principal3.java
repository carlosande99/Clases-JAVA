package com.ipartek.list.listiterator;

import com.ipartek.list.models.Arbol;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal3 {

    public static void main(String[] args) {

        /// ////////////////////////////////////////////////////////////////////
        //DIFERENCIAS ENTRE ITERATOR Y LIST ITERATOR
        /// ///////////////////////////////////////////////////////////////////
        //ITERATOR: sirven para todas las colecciones (List y Sets)
        //LIST ITERATOR: solo lo tienen los List

        //1) Con Iterator solo podemos movernos hacia adelante. Con ListIterator podemos hacerlo hacia adelante y hacia atrás
        //2) Con ListIterator podemos obtener el índice mientras recorremos el List. Esto no es posible con iterator.
        //3) Con Iterator solo podemos comprobar si existe un elemento delante del cursor. Con ListIterator podemos hacer la comprobación hacia adelante y hacia atrás
        //4) Con ListIterator podemos añadir un elemento en cualquier punto donde nos encontremos mientras recorremos el List. Con iterator esto no es posible
        //4) Con ListIterator podemos eliminar un elemento en cualquier punto donde nos encontremos mientras recorremos el List. Con iterator esto no es posible


        ///   //////////////////////////////////////////////////////////////////

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


        //Un List no tiene un ListIterator por defecto: tenemos que crearlo
        //A continuación vamos a crear un ListIterator y de esta manera
        //dotar al ArrayList bosque de un cursor (pointer)

        ListIterator<Arbol> iteradorBosque = bosque.listIterator();

        //El método listIterator (está en la interface List) tiene otra sobrecarga
        //en la que podremos introducir como argumento el índice inicial en el que
        //queremos que se situe el iterador (cursor o pointer)

        //En estos momentos bosque ya tiene su iterador que se encuentra en la posición inicial
        //INMEDIATAMENTE ANTES de primer elemento.
        //Esto significa que podemos recorrerlo en todas las direcciones con su cursor

        System.out.println("El siguiente índice es: " + iteradorBosque.nextIndex());//0 - El cursor no se mueve
        System.out.println("Hay un elemento previo?: " + (iteradorBosque.hasPrevious() ? "si" : "no"));//no - El cursor no se mueve
        System.out.println("Hay un elemento posterior?: " + (iteradorBosque.hasNext() ? "si" : "no"));//si -El cursor no se mueve

        System.out.println("=================================================================================");

        while(iteradorBosque.hasNext()){
            Arbol elArbol = iteradorBosque.next();//Nos movemos!!! de uno en uno hacia adelante
            System.out.println(elArbol);
        }

        System.out.println("=================================================================================");

        //Hasta aquí no podemos observar ninguna diferencia con respecto a utilizar, por ejemplo, un forEach
        //pero...el cursor del iterador está ahora en la última posición

        System.out.println("El siguiente índice es: " + iteradorBosque.nextIndex());//10 (no existe) - El cursor no se mueve
        System.out.println("Hay un elemento previo?: " + (iteradorBosque.hasPrevious() ? "si" : "no"));//si - El cursor no se mueve
        System.out.println("Hay un elemento posterior?: " + (iteradorBosque.hasNext() ? "si" : "no"));//no -El cursor no se mueve

        //Ahora vamos a recorrer el ArrayList de atrás hacia adelante

        System.out.println("=================================================================================");

        while(iteradorBosque.hasPrevious()){
            Arbol elArbol = iteradorBosque.previous();//Nos movemos!!! de uno en uno para atrás
            System.out.println(elArbol);
        }

        System.out.println("=================================================================================");


        //Esto no significa que el orden de los elementos del ArrayList haya cambiado...

        //Si en vez de utilizar next y previous dentro de un while lo utilizamos en una sola orden nos moveremos simplemente
        //una posición hacia adelante o una posición hacia detrás...
        Arbol arbolDevuelto = iteradorBosque.next(); //el iterador se mueve una posición hacia adelante
        System.out.println("arbolDevuelto = " + arbolDevuelto);//Especie: Fresno - Altura: 13.0
        System.out.println("El siguiente índice es: " + iteradorBosque.nextIndex());//1
        System.out.println("=================================================================================");
        Arbol arbolDevuelto2 = iteradorBosque.next(); //el iterador se mueve una posición hacia adelante
        System.out.println("arbolDevuelto2 = " + arbolDevuelto2);//Especie: Roble - Altura: 10.0
        System.out.println("El siguiente índice es: " + iteradorBosque.nextIndex());//2
        System.out.println("=================================================================================");

        //Ahora vamos a sustituir un elemento en la posición en la que nos encontramos
        //El método set sustituye en el List el elemento pasado como argumento por el
        //último elemento devuelto por next. De esta forma Java se asegura que existe el elemento a sustituir

        Arbol arbolASustituir = iteradorBosque.next();
        System.out.println("arbolASustituir = " + arbolASustituir);//Especie: Fresno - Altura: 13.0 - es el tercer elemento (indice 2)
        Arbol manzano = new Arbol("Manzano",3.0);
        iteradorBosque.set(manzano);

        System.out.println("=================================================================================");

        bosque.forEach(System.out::println);

        System.out.println("=================================================================================");


        //Ahora vamos a eliminar un elemento...
        //El método remove elimina el último elemento devuelto por next o previous
        //De esta manera Java se asegura que existe el elemento a eliminar
        iteradorBosque.remove();//Elimina el último elemento devuelto por next que era el fresno peo que ahora es el manzano
        //por lo tanto será el manzano el elemento eliminado...
        //Al eliminar un elemento el cursor se mueve una posicón hacia atrás

        bosque.forEach(System.out::println);

        System.out.println("=================================================================================");


        //Ahora vamos a añadir un nuevo árbol en la posición en la que se encuentra el cursor...
        System.out.println("Cual es la posición del cursor antes de añadir el elemento: " + iteradorBosque.nextIndex());//2
        Arbol naranjo = new Arbol("Naranjo",2.0);
        iteradorBosque.add(naranjo);
        //¿Qué sucede cuando añadimos un nuevo elemento? ... el cursor se adelanta una posición
        System.out.println("Cual es la posición del cursor después de añadir el elemento: " + iteradorBosque.nextIndex()); //3

        bosque.forEach(System.out::println);

        System.out.println("=================================================================================");

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //QUÉ SUCEDE CON EL ITERADOR SI ELIMINAMOS TODOS LOS ELEMENTOS DE UNA LISTA?
        /// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
        bosque.clear();//el iterador se destruye

        bosque.add(new Arbol("Fresno",13.0));
        bosque.add(new Arbol("Roble",10.0));
        bosque.add(new Arbol("Fresno",13.0));
        bosque.add(new Arbol("Nogal",9.0));
        bosque.add(new Arbol("Nogal",9.0));
        bosque.add(new Arbol("Nogal",9.0));

        System.out.println("El bosque está vacío?: " + (bosque.isEmpty() ? "si" : "no"));//no

        System.out.println("Cual es el siguiente indice? :"  +  iteradorBosque.nextIndex());//3 - falso positivo
        //Arbol otroArbol = iteradorBosque.next();//ConcurrentModificationException


        //Cuando borramos todos los elementos de un ArrayList el iterador "se rompe"
        //¿Qué tendríamos que hacer en este caso? : crear uno nuevo
        ListIterator<Arbol> iteradorBosque2 = bosque.listIterator();

        
    }
}
