package com.ipartek.asignacion;

import com.ipartek.models.*;

public class Principal1 {



    public static void main(String[] args) {


        //POLIMORFISMO DE ASIGNACION
        Object furia = new Caballo();
        Caballo niebla = new Caballo("Niebla");


        /*niebla.metodoCaballo();
        furia.metodoAnimal();*/

        Orco urk = new Orco();
        Object grork = new Orco("Grork",8,3);

        String elNombre = urk.getNombre();
        System.out.println("elNombre = " + elNombre);

        urk.tirarConArco();
        //grork.tirarConArco();
        urk.robarGallinas();
        //grork.robarGallinas();







    }


}
