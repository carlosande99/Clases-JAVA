package com.ipartek.interfaces_genericas;

public class Principal3 {

    public static void main(String[] args) {

        //Los tipoos de una inerface genérica se deciden (los decide el programador)
        //en el momento de la implemetación de la interface

        MiInterface miObjeto = new MiClase();
        MiInterfaceG<String,Boolean,Integer> miObjeto2 = new MiClase2();
        MiInterfaceG<Vaca,Velocidad,Barco> miObjeto3 = new MiClase3();


    }
}
