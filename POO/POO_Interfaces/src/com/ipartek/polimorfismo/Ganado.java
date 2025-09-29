package com.ipartek.polimorfismo;

public abstract class Ganado extends LaGranja implements IAcorralable{

    private Double peso;
    private Integer edad;


    /// /////////////////////////////////////////////////////////

    public Ganado(Double precio, Double peso, Integer edad) {
        super(precio);
        this.peso = peso;
        this.edad = edad;
    }

    /// /////////////////////////////////////////////////////////


    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }



    /// /////////////////////////////////////////////////////////////////








    /// //////////////////////////////////////////////////////////////////







}
