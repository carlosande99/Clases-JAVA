package com.ipartek.wildcards;

public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("guau guau!!!");
    }
}
