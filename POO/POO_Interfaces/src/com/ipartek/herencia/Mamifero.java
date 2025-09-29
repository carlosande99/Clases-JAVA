package com.ipartek.herencia;

public abstract class Mamifero extends Animal {

    public void metodoMamifero(){
        System.out.println("soy un método de mamífero");
    }


    @Override
    public void metodoIUna2() {
        System.out.println("mamifero implementando metodoIUna2");
    }
}
