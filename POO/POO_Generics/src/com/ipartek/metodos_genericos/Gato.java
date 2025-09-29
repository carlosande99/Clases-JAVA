package com.ipartek.metodos_genericos;

public class Gato {

    private String nombre;
    private Integer edad;

    /// ////////////////////////////////////////////

    public Gato(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /// /////////////////////////////////////////////


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    /// ///////////////////////////////////////////////////






    /// ////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
