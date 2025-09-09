package com.ipartek.models;

import javax.swing.*;

public class Orco extends Humanoide{


    //no tiene atributos

    /// /////////////////////////////////////////////////////

    public Orco() {
    }

    public Orco(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    /// /////////////////////////////////////////////////////

    public void robarGallinas(){

        System.out.println("Orco robando gallinas");
    }

    /// ////////////////////////////////////////////////////

    @Override
    public void tirarConArco() {
        JOptionPane.showMessageDialog(null,"Orco tirando fatal con arco");
    }

    @Override
    public String toString() {
        return "nombre: " + this.getNombre() + " - " + "fuerza: " + this.getFuerza() + " - " + "inteligencia: " + this.getInteligencia();
    }


}
