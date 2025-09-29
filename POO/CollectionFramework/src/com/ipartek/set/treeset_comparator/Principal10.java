package com.ipartek.set.treeset_comparator;

import com.ipartek.set.models.Estudiante;
import com.ipartek.set.treeset_comparator.comparadores.OrdenarCiudad;
import com.ipartek.set.treeset_comparator.comparadores.OrdenarEdad;
import com.ipartek.set.treeset_comparator.comparadores.OrdenarNombre;

import java.util.Set;
import java.util.TreeSet;

public class Principal10 {

    public static void main(String[] args) {

        //Set<Estudiante> colegio = new TreeSet<>();
        //Set<Estudiante> colegio = new TreeSet<>(new OrdenarCiudad());
        //Set<Estudiante> colegio = new TreeSet<>(new OrdenarEdad());
        Set<Estudiante> colegio = new TreeSet<>(new OrdenarNombre());


        Estudiante pepe = new Estudiante("Pepe",34,"Bilbao");
        Estudiante julia = new Estudiante("Julia",23,"Burgos");
        Estudiante antonio = new Estudiante("Antonio",24,"Zaragoza");
        Estudiante julia2 = new Estudiante("Julia",14,"Zaragoza");
        Estudiante julia3 = new Estudiante("Julia",14,"Zaragoza");
        Estudiante alvaro = new Estudiante("Alvaro",14,"Murcia");
        Estudiante alvaro2= new Estudiante("Alvaro",14,"Murcia");

        colegio.add(pepe);
        colegio.add(julia);
        colegio.add(antonio);
        colegio.add(julia2);
        colegio.add(julia3);
        colegio.add(alvaro);
        colegio.add(alvaro2);


        colegio.forEach(System.out::println);



    }



}
