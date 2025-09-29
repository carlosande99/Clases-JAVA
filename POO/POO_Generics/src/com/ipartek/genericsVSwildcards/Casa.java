package com.ipartek.genericsVSwildcards;

public class Casa {

    private String direccion;

    /// ////////////////////////////////////////

    public Casa(String direccion) {
        this.direccion = direccion;
    }

    /// /////////////////////////////////////////

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    /// ///////////////////////////////////////////////





    /// //////////////////////////////////////////////////

    @Override
    public String toString() {
        return "La dirección de la casa es: " + this.direccion;
    }
}
