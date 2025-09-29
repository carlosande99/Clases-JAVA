package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Casa extends Edificio{

    private Integer numeroPlazasDeGaraje;
    private List<IAparcable> garaje = new ArrayList<>();


    /// /////////////////////////////////////////////////////

    public Casa(Double precio, String denominacion, Integer capacidadOcupantes, Integer numeroPlazasDeGaraje) {
        super(precio, denominacion, capacidadOcupantes);
        this.numeroPlazasDeGaraje = numeroPlazasDeGaraje;
    }

    /// ///////////////////////////////////////////////////


    public Integer getNumeroPlazasDeGaraje() {
        return numeroPlazasDeGaraje;
    }

    public void setNumeroPlazasDeGaraje(Integer numeroPlazasDeGaraje) {
        this.numeroPlazasDeGaraje = numeroPlazasDeGaraje;
    }

    public List<IAparcable> getGaraje() {
        return garaje;
    }

    public void setGaraje(List<IAparcable> garaje) {
        this.garaje = garaje;
    }

    /// /////////////////////////////////////////////////////////





    /// //////////////////////////////////////////////////////////////






}
