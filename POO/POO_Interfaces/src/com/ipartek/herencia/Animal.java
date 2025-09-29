package com.ipartek.herencia;

public abstract class Animal implements IUna{

    public abstract void metodoAnimal();


    @Override
    public void metodoIUna1() {
        System.out.println("animal implementando metodoIUna1");
    }


}
