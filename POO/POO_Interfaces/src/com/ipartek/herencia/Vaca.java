package com.ipartek.herencia;

public class Vaca extends Mamifero{

    public void metodoVaca(){

        System.out.println("soy un método de la Vaca");
    }

    @Override
    public void metodoAnimal() {
        System.out.println("metodo Animal implementado en Vaca");
    }


    @Override
    public void metodoMamifero() {
        super.metodoMamifero();
    }

    @Override
    public void metodoIDos1() {

    }

    @Override
    public void metodoIDos2() {

    }

    @Override
    public void metodoIDos3() {

    }

    @Override
    public void metodoITres1() {

    }
}
