package com.ipartek;

public enum Fabricante {


    FERRARI("Ferrari","Italia"),
    SEAT("S.E.A.T.","España"),
    PORSCHE("Porsche","Alemania");


    private String nombre;
    private String pais;


    Fabricante(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }



    /// //////////////////////////////////////////////





}
