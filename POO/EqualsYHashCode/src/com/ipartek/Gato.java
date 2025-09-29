package com.ipartek;

import java.util.Objects;

public class Gato {

    private String nombre;
    private String colorOjos;
    private String colorPelo;

    /// //////////////////////////////////////////////////

    public Gato(String nombre, String colorOjos, String colorPelo) {
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

    public void maullar(){
        System.out.println("Gato maullando");
    }

    public void jugarPelota(){
        System.out.println("Gato jugando con una pelota");
    }


    /// //////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", colorPelo='" + colorPelo + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(this.nombre, gato.nombre) && Objects.equals(this.colorOjos, gato.colorOjos) && Objects.equals(this.colorPelo, gato.colorPelo);
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.colorOjos, this.colorPelo);//"Fifí","Azul","Blanco"
    }


}
