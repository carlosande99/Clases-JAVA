package com.ipartek.objetos_mutables;

public class Gato {

    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
