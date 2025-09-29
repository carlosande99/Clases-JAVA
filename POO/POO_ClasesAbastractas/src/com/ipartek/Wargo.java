package com.ipartek;

public class Wargo extends Animal{


    private String nombre;

    /// /////////////////////////////////////////////

    public Wargo(int edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////////////

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////////////

    public void metodoWargo(){

        System.out.println("Soy un método de wargo");
    }


    @Override
    public String dimeTuNombre() {
        return this.nombre;
    }
}
