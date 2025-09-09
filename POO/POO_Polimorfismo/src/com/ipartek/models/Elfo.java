package com.ipartek.models;

import javax.swing.*;

public class Elfo extends Humanoide{

    //no tiene atributos

    /// /////////////////////////////////////////////////

    public Elfo(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    public Elfo() {
    }

    /// //////////////////////////////////////////////////

    public void fabricarLembas(){

        JOptionPane.showMessageDialog(null,"Elfo fabricando Lembas");
    }



}
