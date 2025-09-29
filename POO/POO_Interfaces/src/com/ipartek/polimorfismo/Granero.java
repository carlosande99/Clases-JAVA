package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Granero extends Edificio{


    private Integer capacidadProductos;
    private List<IAlmacenable> productos = new ArrayList<>();


    /// /////////////////////////////////////////////////////////////

    public Granero(Double precio, String denominacion, Integer capacidadOcupantes, Integer capacidadProductos) {
        super(precio, denominacion, capacidadOcupantes);
        this.capacidadProductos = capacidadProductos;
    }

    /// //////////////////////////////////////////////////////////////

    public Integer getCapacidadProductos() {
        return capacidadProductos;
    }

    public void setCapacidadProductos(Integer capacidadProductos) {
        this.capacidadProductos = capacidadProductos;
    }

    public List<IAlmacenable> getProductos() {
        return productos;
    }

    public void setProductos(List<IAlmacenable> productos) {
        this.productos = productos;
    }


    /// ////////////////////////////////////////////////////////////////////////







    /// /////////////////////////////////////////////////////////////////////////









}
