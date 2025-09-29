package com.ipartek.clases_genericas;

public class Vaca {

    public String nombre;

    /// ///////////////////////////////////

    public Vaca(String nombre) {
        this.nombre = nombre;
    }

    /// //////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// ///////////////////////////////////

    @Override
    public String toString() {
        return "Vaca{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
