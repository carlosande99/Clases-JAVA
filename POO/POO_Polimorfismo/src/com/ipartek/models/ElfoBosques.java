package com.ipartek.models;

import javax.swing.*;

public class ElfoBosques extends Elfo{

    //no tiene atributos propios

    /// //////////////////////////////////////////////////

    public ElfoBosques(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }

    public ElfoBosques() {
    }


    /// //////////////////////////////////////////////////////

    public void hablarConAnimales(){

        JOptionPane.showMessageDialog(null,"elfo de los bosques hablando con animales");
    }

    /// ///////////////////////////////////////////////////////////

    @Override
    public void tirarConArco() {
        JOptionPane.showMessageDialog(null,"Elfo de los bosques tirando brillantemente con arco");
    }


    @Override
    public void fabricarLembas() {
        JOptionPane.showMessageDialog(null,"Elfo de los Bosques fabricando un lembas riquísimo");
    }


    @Override
    public String toString() {
        return "nombre: " + this.getNombre() + " - " + "fuerza: " + this.getFuerza() + " - " + "inteligencia: " + this.getInteligencia();
    }
}
