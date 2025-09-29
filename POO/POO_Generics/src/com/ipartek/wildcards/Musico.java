package com.ipartek.wildcards;

public class Musico extends Persona{

    private String instrumento;

    /// ////////////////////////////////////////////

    public Musico(String nombre, String instrumento) {
        super(nombre);
        this.instrumento = instrumento;
    }

    /// //////////////////////////////////////////////

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /// /////////////////////////////////////////////


    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " - " + instrumento;
    }
}
