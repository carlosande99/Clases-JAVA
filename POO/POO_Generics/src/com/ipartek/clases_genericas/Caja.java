package com.ipartek.clases_genericas;

public class Caja {

    private String dato;

    /// /////////////////////////////////////

    public Caja(String dato) {
        this.dato = dato;
    }

    /// ////////////////////////////////////////

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }


    /// ////////////////////////////////////////////

    public String miMetodo(Integer i, String s){

        return s;
    }



    /// ///////////////////////////////////////////


    @Override
    public String toString() {
        return this.dato;
    }
}
