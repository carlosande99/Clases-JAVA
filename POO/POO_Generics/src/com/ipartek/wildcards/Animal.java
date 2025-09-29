package com.ipartek.wildcards;

public class Animal {

    private String nombre;

    /// //////////////////////////////////////

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /// ////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////


    public void emitirSonido(){

        System.out.println("Emite sonido como animal");
    }


    /// /////////////////////////////////////////




}
