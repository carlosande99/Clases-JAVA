package com.ipartek;

import java.util.ArrayList;

public abstract class Humanoide {

    private String nombre;
    private int fuerza;
    private int inteligencia;

    /// //////////////////////////////////////////////


    public Humanoide(String nombre, int fuerza, int inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    /// ////////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }


    /// ///////////////////////////////////////////////////////////////

    public abstract void cabalgar(Animal elAnimal);

    public abstract void tirarArco();


    public void comer(){

        System.out.println("Humanoide comiendo");
    }

    /// /////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Humanoide{" +
                "nombre='" + nombre + '\'' +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                '}';
    }




}
