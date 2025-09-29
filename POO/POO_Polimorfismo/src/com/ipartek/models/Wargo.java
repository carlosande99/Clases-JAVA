package com.ipartek.models;

public class Wargo extends Animal{

    //No tiene atributos propios

    /// ////////////////////////////////////////////////////

    public Wargo(String nombre) {
        super(nombre);
    }

    /// ///////////////////////////////////////////////////

    public void metodoWargo(){

        System.out.println("Soy el método de un Wargo");
    }


    /// ///////////////////////////////////////////////////


    @Override
    public void comer() {
        System.out.println("Wargo comiendo carne");
    }

}
