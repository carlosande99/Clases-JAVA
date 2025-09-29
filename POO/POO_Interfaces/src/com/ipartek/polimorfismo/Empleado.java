package com.ipartek.polimorfismo;

public class Empleado implements IAlbergable{

    private String nombre;
    private Cargo cargo;
    private Double sueldo;
    private Integer edad;


    /// /////////////////////////////////////////////////////

    public Empleado(String nombre, Cargo cargo, Double sueldo, Integer edad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.edad = edad;
    }

    /////////////////////////////////////////////////////////

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    /// //////////////////////////////////////////////////////////////

    @Override
    public void entrarEdificio(Edificio elEdificio){

        //meter la persona en el array de personas del edificio

        elEdificio.controlOcupantes(this);



    }






    /// //////////////////////////////////////////////////////////////




}
