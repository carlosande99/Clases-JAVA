package com.ipartek;

public class Automovil {

    private ColorAutomovil colorAutomovil;
    private Fabricante fabricante;
    private String modelo;


    public Automovil(ColorAutomovil colorAutomovil, Fabricante fabricante, String modelo) {
        this.colorAutomovil = colorAutomovil;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    /// ///////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "=============================================================" + "\n" +
                "AUTOMÓVIL" + "\n" +
                "=============================================================" + "\n" +
                "Nombre del fabricante: " + this.fabricante.getNombre() + "\n" +
                "País del fabricante: " + this.fabricante.getPais() + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.colorAutomovil.getColorComercial() + "\n" +
                "Referencia de Color: " + this.colorAutomovil.getRefColor() + "\n" +
                "=============================================================";

    }
}
