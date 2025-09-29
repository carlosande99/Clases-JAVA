package com.ipartek.clases_genericas;

public class CajaG<T>{

    private T dato;

    /// //////////////////////////////////

    public CajaG(T dato) {
        this.dato = dato;
    }

    //////////////////////////////////////

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    /// ///////////////////////////////////////

    public T miMetodo (Integer i, T dato){

        return dato;
    }

    /// //////////////////////////////////////

    @Override
    public String toString() {
        return "CajaG{" +
                "dato=" + dato +
                '}';
    }


}
