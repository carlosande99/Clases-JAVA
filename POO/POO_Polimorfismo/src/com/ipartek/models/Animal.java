package com.ipartek.models;

public class Animal{


    private String nombre;

    /// /////////////////////////////////////

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
    }

    /// /////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////


    public void comer(){
        System.out.println("comiendo como animal");
    }


    /// ///////////////////////////////////////




}
