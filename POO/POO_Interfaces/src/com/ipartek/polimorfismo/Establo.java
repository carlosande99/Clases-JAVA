package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Establo extends Edificio{


  private Integer capacidadAnimales;
  private List<IAcorralable> animales = new ArrayList<>();


  ///  ///////////////////////////////////////////////////////////////

    public Establo(Double precio, String denominacion, Integer capacidadOcupantes, Integer capacidadAnimales) {
        super(precio, denominacion, capacidadOcupantes);
        this.capacidadAnimales = capacidadAnimales;
    }

    /// ///////////////////////////////////////////////////////////////

    public Integer getCapacidadAnimales() {
        return capacidadAnimales;
    }

    public void setCapacidadAnimales(Integer capacidadAnimales) {
        this.capacidadAnimales = capacidadAnimales;
    }

    public List<IAcorralable> getAnimales() {
        return animales;
    }

    public void setAnimales(List<IAcorralable> animales) {
        this.animales = animales;
    }



    /// ///////////////////////////////////////////////////////






    /// ////////////////////////////////////////////////////////








}
