package com.ipartek;

public abstract class Animal {

    private int edad;

    /// ///////////////////////////////////////////////

    public Animal(int edad) {
        this.edad = edad;
    }

    /// /////////////////////////////////////////////

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    /// /////////////////////////////////////////////////

    public void emitirSonido(){

        System.out.println("Emite sonido como animal");
    }

    public void comer(){

        System.out.println("Come como animal");
    }

    public abstract String dimeTuNombre();


    /// ////////////////////////////////////////////////






}
