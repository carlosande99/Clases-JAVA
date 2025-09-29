package com.ipartek.models;

public class Caballo extends Animal {


    //no tiene atributos

    /// ////////////////////////////////////
    public Caballo(String nombre) {
        super(nombre);//la llamada a super tiene que ponenrse SIEMPRE Y OBLIGATORIAMENTE en al primera linea del constructor
    }

    public Caballo() {
        super();
    }

/// /////////////////////////////////////




    /// /////////////////////////////////////

    public void metodoCaballo(){

        System.out.println("soy un método de un caballo");
    }

    /// ////////////////////////////////////


    @Override
    public void comer() {
        System.out.println("caballo comiendo un fardo de paja");
    }


}
