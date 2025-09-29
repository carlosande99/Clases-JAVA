package com.ipartek.wildcards;

public class Gato extends Animal {


    public Gato(String nombre) {
        super(nombre);
    }


    @Override
    public void emitirSonido() {
        System.out.println("miau miau!!!");
    }
}
