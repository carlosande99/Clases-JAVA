package com.ipartek;

import java.util.Objects;

public class Perro {

    private String nombre;
    private String colorOjos;
    private String colorPelo;

    /// //////////////////////////////////////////////////

    public Perro(String nombre, String colorOjos, String colorPelo) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
    }

    /// ///////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }


    /// ///////////////////////////////////////////////////////////////

    public void ladrar(){
        System.out.println("Perro ladrando");
    }

    public void jugarPelota(){
        System.out.println("Perro jugando con una pelota");
    }


    /// //////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }

    //this es fifi
    //o fifi3 que es un Gato
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()){ return false; };
        Perro perro = (Perro) o;
        return Objects.equals(this.nombre, perro.nombre) && Objects.equals(this.colorOjos, perro.colorOjos) && Objects.equals(this.colorPelo, perro.colorPelo);

    // public static boolean equals(Object a, Object b) {  //a es "Fifí" y b es "Fifí"
        //        return (a == b) || (a != null && a.equals(b));
        //    }

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.colorOjos, this.colorPelo); //"Fifí","Azul","Blanco"
    }



}
