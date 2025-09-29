package com.ipartek.genericsVSwildcards;

import java.util.List;

public class Principal6 {

    public static void main(String[] args) {


        /// //////////////////////////////////////////////////////////////
        //  MÉTODOS GENÉRICOS
        /// /////////////////////////////////////////////////////////////
        //Para escribir un método genérico con un argumento genérico
        //debemos utilizar un parámetro de tipo (<T> en la firma del método)
        //Por ejemplo vamos a crear un método genérico que imprima
        //cualquier objeto que le pasemos (el método "imprimir" lo podemos encontrar debajo de este método "main")

        imprimir(new Arbol("Almendro"));
        imprimir(new Casa("Rue del Percebe 13"));
        imprimir("hola");
        imprimir(456.78);
        //Comprobamos que todo funciona correctamente: podremos pasar cualquier objeto de la clase que deseemos
        //tamto una clase propia como del JDK)


        //LÍMITES, RESTRICCIONES  O BOUNDS ///////////////////////////////////////////////////////////

        //En los tipos genericos (generics)...

        //El límite (o bound) de un tipo genérico nos permite restringir qué tipos
        //podemos utilizar en el lugar del tipo genéricos...
        //Esta característica de Java permite trarar generics de forma polomórfica...
        //Por ejemplo: es posible que un método que opere con números solo quiera aceptar instancias de la clase Number
        //o de sus subclases (Wrappers numéricos)
        //Posemos utilizar tipos parametrizados (generics) de dos formas:

        //1) tipos ilimitados: List<T> - Representa una lista de tipos T. T puede ser cualquier tipo
        //2) tipos acotados o limitados: List<T extends Number & Comparable> representa una lista de tipos T y sus subtipos que tienen que extender de number e implementar la interface Comparable
        //Este tipo de anotación: "clase & interface & interface" requiere que la clase vaya en primer lugar y después la declaración de interfaces
        //No podemos utilizar, al contrario que los WildCards, tipos parametrizados "con límite inferior", no podemos poner, por ejemplo T super Number
        //Los generics (tipos parametrizados) pueden tener múltiples límites. Sin embargo los WildCards, no.


        //En los WildCards...

        //Podemos utilizar WildCards con límites (bounds) de tres formas:

        //1) ilimitados: List<?> - Representa una lista de cualquier tipo
        //2) límite superior: List<? extends Number> - Representa una lista de Number o de cualquiera de sus subclases (Wrapper numéricos)
        //3) limite inferior: List<? super Integer> - Representa una lista de Integer o de sus supertipos (Number)

    }




    public static <T> void imprimir( T item){

        System.out.println(item);
    }


    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //¿EN QUÉ CIRCUNSTANCIAS UTILIZAREMOS UNO U OTRO?
    /// ////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Los WildCards hacen el código más simple y flexible
    //A nivel general si observamos que un parámetro de tipo (genérico)
    //aparece solo una vez en la declaración de un método deberíamos considerar reemplaaarlo por un wildcard
    //Si no existen límites inferiores o superiores el wildcard representa cualquier tipo:
    //Ejemplo:
    public static <E> void unir(List<E> laLista){

    }

    //Deberíamos sustituir el método de esta forma:
    public static void unir2(List<?> laLista){


    }

    /// //////////////////////////////////////////////////////////////////////////////////
    //CUANDO UTILIZAR TIPOS GENÉRICOS
    /// /////////////////////////////////////////////////////////////////////////////////

    //1) Cuando queramos utilizar un tipo CONCRETO y utilizarlo dentro del método, clase o interface
    //2) Cuando vayamos a modificar, escribir o leer datos de ese tipo
    //3) Cuando necesitemos utilizar un fuerte tipado
    //4) Siempre y cuando estés utilizando estructuras genéricas: clases, interfaces o métodos

    /// //////////////////////////////////////////////////////////////////////////////////
    //CUANDO UTILIZAR WILDCARDS
    /// /////////////////////////////////////////////////////////////////////////////////

    //1) Cuando no necesitemos cambiar la esctructura de un objeto, SÓLO LEERLA
    //2) Cuando necesitemos trabajar con subtipos o supertipos sin definir un tipo genérico
    //3) Cuando estemos consumiendo estructuras genéricas. Por ejemplo un List
    //no podemos utilizar un WildCard si no existe una estructura genérica definida :
    /*
    public static <T extends > void imprimir( ? item){

        System.out.println(item);
    }
     */



}
