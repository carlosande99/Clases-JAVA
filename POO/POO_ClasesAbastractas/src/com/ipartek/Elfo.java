package com.ipartek;

public abstract class Elfo extends Humanoide{

    //No tiene atributos propios

    /// ///////////////////////////////////////////////

    public Elfo(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// ///////////////////////////////////////////////

    public void fabricarLembas(){

        System.out.println("Elfo fabricando Lembas");
    }

    public abstract void imponerManos();

    /// ///////////////////////////////////////////////

    @Override
    public void cabalgar(Animal elAnimal) {
        System.out.println(this.getNombre() + " cabalgando magistralmente a " + elAnimal.dimeTuNombre());
    }

    /*@Override
    public void tirarArco() {
        System.out.println("Tirar con arco bastante bien");
    }*/
}
