package com.ipartek.polimorfismo;

import java.util.ArrayList;

public class Principal2 {

    public static void main(String[] args) {


        Granero graneroNorte = new Granero(150000.0,"Granero Norte",5,100);
        Establo establoNorte = new Establo(200000.0,"Establo Norte",5, 10);
        Casa casaPrincipal = new Casa(250000.0,"Casa Principal",20, 4);

        Empleado juan = new Empleado("Juán Pérez",Cargo.CAPATAZ,3000.0,45);
        Empleado gabriela = new Empleado("Gabriela Sanz",Cargo.VETERINARIO,4000.0,34);
        Perro fifi = new Perro("Fifí");

        //graneroNorte.getOcupantes().forEach(System.out::println);
        /*String resultado = graneroNorte.getOcupantes().isEmpty() ? "Esta Vacio" : "Hay alguien";
        System.out.println("resultado = " + resultado);*/

        juan.entrarEdificio(graneroNorte);
        gabriela.entrarEdificio(graneroNorte);
        fifi.entrarEdificio(graneroNorte);

        System.out.println(graneroNorte.relacionOcupantes());


        

    }


}
