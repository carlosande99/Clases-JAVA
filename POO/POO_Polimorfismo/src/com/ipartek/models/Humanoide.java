package com.ipartek.models;

import javax.swing.*;

public class Humanoide {

    private String nombre;
    private int fuerza;//parametrizada de 0 a 10 de menor a mayor
    private int inteligencia;//parametrizar de 0 a 10 de menor a mayor



    /// ///////////////////////////////////////////////////////////////////

    public Humanoide() {
    }

    public Humanoide(String nombre, int fuerza, int inteligencia) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    /// ///////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    /// ////////////////////////////////////////////////

    public void cabalgar(){
        System.out.println("Humanoide cabalgando");
    }


    public void tirarConArco(){

        JOptionPane.showMessageDialog(null,"Humanoide tirando con arco");
    }

    /// /////////////////////////////////////////////////




}
