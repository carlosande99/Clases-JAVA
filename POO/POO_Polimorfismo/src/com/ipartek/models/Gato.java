package com.ipartek.models;

public class Gato {

    private int edad;
    private String nombre;
    private String color;



    /// ////////////////////////////////////////////////////////

    //Sobrecarga de constructores
    //Si en una clase no especificamos un constructor Java crea un constructor
    //vacío por defecto en tiempo de RunTime.
    //TODAS las clases en Java tienen un constructor vacío por defecto siempre
    //y cuando NO TENGA OTRO CONSTRUCTOR!!!!
    public Gato() {
    }

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Gato(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    //Si intentamos hacer una sobrecarga edad-color no es posible

    public Gato(int edad, String nombre, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.color = color;
    }

    /// ////////////////////////////////////////////////////////

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /// /////////////////////////////////////////////////////

    public String maullar(){

        return "miau miau";
    }


    public String maullar(int nVeces){

        String maullidoFinal = "";

        for( int i=1 ; i <= nVeces; i++){

            maullidoFinal += " miau!";
        }

        return maullidoFinal;

    }







    /// /////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "====================================================" + "\n" +
                "NOMBRE: " + this.getNombre() + "\n" +
                "EDAD: " + this.getEdad() + "\n" +
                "COLOR: " + this.getColor() + "\n" +
                "====================================================";

    }


}
