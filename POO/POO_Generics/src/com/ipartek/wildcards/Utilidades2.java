package com.ipartek.wildcards;

import java.util.List;

public class Utilidades2 {

    public static void animalesEmitiendoSonidos(List<? extends Animal> laLista){


        //laLista.forEach(    item->item.emitirSonido()  );

        laLista.forEach(Animal::emitirSonido);//Desde es punto de vista de la lectura no hay ningún problema

    }

    public static void agregarPerros(List<? extends Animal> laLista){

        //Cualquier objeto que reciba no es susceptible de ser escrito
        //laLista.add(new Gato("Jacinta"));//no funciona para escribir
        //laLista.add(new Perro("Jacinta"));//no funciona para escribir
        //laLista.add(new Animal("Jacinta"));//no funciona para escribir

    }


    //Resumen Wildcards

    //List<?> - Lista de cualquier tipo - se puede leer - no se puede escribir
    //List<? extends T> - Lista de T oñ subclases de T - se puede leer y no se puede escribir
    //List<? super T> - Liste de T o superclases de T - no se puede leer como T (entra disfrazado) - se puede escribir como T



}
