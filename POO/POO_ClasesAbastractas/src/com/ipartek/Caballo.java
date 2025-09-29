package com.ipartek;

public class Caballo extends Animal implements ICabalgable{


    private String nombre;

    /// /////////////////////////////////////////////

    public Caballo(int edad, String nombre) {
        super(edad);
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /// ///////////////////////////////////////////////

    public void metodoCaballo(){

        System.out.println("Soy un método de caballo");
    }


    @Override
    public String dimeTuNombre() {
        return this.nombre;
    }
}
