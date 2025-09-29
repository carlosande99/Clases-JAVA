package com.ipartek;

public class Orco extends Humanoide{

    //No tiene atributos propios


    /// //////////////////////////////////////////////////////

    public Orco(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }



    /// ////////////////////////////////////////////////////

    public void robar(){

        System.out.println("Orco robando");
    }

    /// /////////////////////////////////////////////////////

    @Override
    public void cabalgar(Animal elAnimal) {

        System.out.println(this.getNombre() + " cabalgando de manera poco hábil a " + elAnimal.dimeTuNombre());

    }

    @Override
    public void tirarArco() {
        System.out.println("Orco tirando con arco fatal");
    }
}
