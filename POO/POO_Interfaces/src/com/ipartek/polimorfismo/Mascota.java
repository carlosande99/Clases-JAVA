package com.ipartek.polimorfismo;

public abstract class Mascota implements IAlbergable{

    private String nombre;

    /// //////////////////////////////////////////////

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    /// //////////////////////////////////////////////

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Cargo getCargo() {
        return Cargo.MASCOTA;
    }


    @Override
    public void entrarEdificio(Edificio elEdificio) {
        elEdificio.controlOcupantes(this);
    }
}
