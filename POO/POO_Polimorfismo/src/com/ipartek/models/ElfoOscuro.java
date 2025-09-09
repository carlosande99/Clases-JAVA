package com.ipartek.models;

import javax.swing.*;

public class ElfoOscuro extends Elfo{

    //no tiene atributos

    /// ////////////////////////////////////////////////////

    public ElfoOscuro(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    public ElfoOscuro() {
    }

    /// /////////////////////////////////////////////////////

    public void hacerMagiaNegra(){

        JOptionPane.showMessageDialog(null, "elfo escuro haciéndo magia negra");
    }

    /// /////////////////////////////////////////////////////


    @Override
    public void fabricarLembas() {
        JOptionPane.showMessageDialog(null,"elfo oscuro fabricando un lembas bastante malillo");
    }




}
