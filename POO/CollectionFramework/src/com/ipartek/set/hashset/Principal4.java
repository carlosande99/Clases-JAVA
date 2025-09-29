package com.ipartek.set.hashset;

import com.ipartek.set.models.Humanoide;
import com.ipartek.set.models.Personaje;

import java.util.*;

public class Principal4 {

    public static void main(String[] args) {


        //Los HashSet (como todos los Set) no admiten duplicados
        //Los HashSet almacenan los datos de manera aleatoria
        //es decir, no respetan el orden de entrada...


        /// ///////////////////////////////////////////////////////////////////////////
        //CON UNA CLASE DEL JDK (STRING)
        /// ///////////////////////////////////////////////////////////////////////////

        Set<String> personajes = new HashSet<>();

        personajes.add("Elfo");
        personajes.add("Elfo");//No ha sido admitido
        personajes.add("Hobbit");
        personajes.add("Humano");
        personajes.add("Enano");
        personajes.add("Orco");
        personajes.add("Orco");//No ha sido admitico
        personajes.add("Gobblin");
        personajes.add("Mago");
        personajes.add("Dragón");

        //Al contrario que los List, el orden de entrada es aleatorio. No se corresponde con el orden natural de entrada
        personajes.forEach(System.out::println);

        System.out.println("========================================================================================");

        //Vamos a intentar ordenarlos (post ordenamiento)
        //Collections.sort(personajes);//El método sort no admite sets

        //Si necesitamos ordenar un Set ¿cómo podemos hacerlo?
        //Para ordenar un Set tenemos que convertirlo en un List
        List<String> personajesList = new ArrayList<>(personajes);

        Collections.sort(personajesList);
        //Collections.sort(personajesList,Comparator.reverseOrder());

        personajesList.forEach(System.out::println);

        System.out.println("========================================================================================");


        /// ///////////////////////////////////////////////////////////////////////////
        //CON UNA CLASE PROPIA (Personaje)
        /// ///////////////////////////////////////////////////////////////////////////


        Set<Personaje> personajes2 = new HashSet<>();

        Personaje personaje1 = new Personaje("Elfo",8,10);
        Personaje personaje2 = new Personaje("Orco",10,5);
        Personaje personaje3 = new Personaje("Orco",5,10);
        Personaje personaje4 = new Personaje("Orco",5,10);//No es admitido
        Personaje personaje5 = new Personaje("Hobbit",5,8);
        Personaje personaje6 = new Personaje("Elfo",8,10);//No es admintido


        personajes2.add(personaje1);
        personajes2.add(personaje2);
        personajes2.add(personaje3);
        personajes2.add(personaje4);
        personajes2.add(personaje5);
        personajes2.add(personaje6);

        personajes2.forEach(System.out::println);

        System.out.println("========================================================================================");




    }
}
