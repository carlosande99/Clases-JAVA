package com.ipartek.set.treeset;

import com.ipartek.set.models.Personaje;

import java.util.Set;
import java.util.TreeSet;

public class Principal9 {

    public static void main(String[] args) {

        //Los TreeSets, como Sets, no admiten duplicados
        //Son los únicos sets que se pueden ordenar, logicamente, con un criiterio
        //Este criterio es de pre ordenamiento (no post ordenamiento como en el caso de un list)

        //Para los objetos de las clases que implemeenten Comparable debe existir  una coherencia (trabajo en equipo)
        //entre los métodos equals, hashCode y compareTo.

        //Si el criterio de pre ordenación de un TreeSet es inconsistente con la implementación del métood equals de
        //su clase genérica, éste no obedece el contrato de la interface Set y por lo tanto funciona incorrectamente

        //En un Set normal no ordenado (HashSet o LinkedHashSet) el criterio de igualdad para los nuevos elementos, candidatos a ingresar
        //en él, se realiza en torno a los métodos equals y hashCode. Pero en el caso de un Set ordenado (TreeSet) estas comprobaciones
        //son realizadas utilizando su método compareTo (de la interface Comparable) o el método compare (de la interface Comparator) por lo
        //que dos elementos que se consideran iguales (que el método devuelva 0) mediante estos métodos, desde el punto de vista de un
        //Set ordenado son iguales.


        /// ///////////////////////////////////////////////////////////////////////////////////////////////////
        //TREE SET CON UN TIPO GENÉRICO DEL JDK (String)
        ///  /////////////////////////////////////////////////////////////////////////////////////////////////
        Set<String> personajes = new TreeSet<>();

        personajes.add("Elfo");
        personajes.add("Elfo");//no ha sido admitido
        personajes.add("Hobbit");
        personajes.add("Humano");
        personajes.add("Enano");
        personajes.add("Orco");
        personajes.add("Orco");//no ha sido admitido
        personajes.add("Gobblin");
        personajes.add("Mago");
        personajes.add("Dragón");

        personajes.forEach(System.out::println);
        //Comprobamos que la ha sido alfabética
        //porque es así como está implementada en la
        //clase String a través del método compareTo
        //de la interface Comparable que implementa la clase


        /// ///////////////////////////////////////////////////////////////////////////////////////////////////
        //TREE SET CON UN TIPO GENÉRICO PROPIO (Pesonaje)
        ///  /////////////////////////////////////////////////////////////////////////////////////////////////

        //Para que un tipo propio (y también un tipo del JDK como hemos visto anteriormente) se pueda ordenar
        //tenemos que cumplir una condición : que ese tipo (clase) inmplemente la interface Comparable  con su
        //único método compareTo para que esa clase tenga un criterio de comparación.

        //Por ejemplo: tanto la clase String como la clase Integer (y todos los Wrappers) vienenn ya con la interface
        //Comparable implementada ( y además no podemos modificarla!!!)

        //Para rellenar un TreeSet con objetos de la clase Personaje necesitaremos  OBLIGATORIAMENTE  tener un criterio
        //de pre ordenación . De lo contrario obtendremos la Excepción ClassCastException


        Set<Personaje> personajes2 = new TreeSet<>();

        personajes2.add(new Personaje("Elfo", 8, 10));
        personajes2.add(new Personaje("Orco", 10, 5));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Orco", 5, 10));
        personajes2.add(new Personaje("Hobbit", 5, 8));
        personajes2.add(new Personaje("Elfo", 8, 10));



        System.out.println("=================================================================================================");


        personajes2.forEach(System.out::println);

        /*Personaje{tipo='Orco', fuerza=5, Inteligencia=10}
        Personaje{tipo='Hobbit', fuerza=5, Inteligencia=8}
        Personaje{tipo='Elfo', fuerza=8, Inteligencia=10}
        Personaje{tipo='Orco', fuerza=10, Inteligencia=5}*/

        /*Personaje{tipo='Elfo', fuerza=8, Inteligencia=10}
        Personaje{tipo='Orco', fuerza=10, Inteligencia=5}
        Personaje{tipo='Orco', fuerza=5, Inteligencia=10}
        Personaje{tipo='Hobbit', fuerza=5, Inteligencia=8}
        Personaje{tipo='Elfo', fuerza=8, Inteligencia=10}*/

        /*Personaje{tipo='Elfo', fuerza=8, Inteligencia=10}
        Personaje{tipo='Orco', fuerza=10, Inteligencia=5}
        Personaje{tipo='Orco', fuerza=5, Inteligencia=10}
        Personaje{tipo='Hobbit', fuerza=5, Inteligencia=8}
        Personaje{tipo='Elfo', fuerza=8, Inteligencia=10}*/



    }
}
