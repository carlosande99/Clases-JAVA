package com.ipartek.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Edificio extends LaGranja{

    private String denominacion;
    private Integer capacidadOcupantes;
    private List<IAlbergable> ocupantes = new ArrayList<>();

    /// ////////////////////////////////////////////////////////////

    public Edificio(Double precio, String denominacion, Integer capacidadOcupantes) {
        super(precio);
        this.denominacion = denominacion;
        this.capacidadOcupantes = capacidadOcupantes;
    }

    /// /////////////////////////////////////////////////////////////


    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Integer getCapacidadOcupantes() {
        return capacidadOcupantes;
    }

    public void setCapacidadOcupantes(Integer capacidadOcupantes) {
        this.capacidadOcupantes = capacidadOcupantes;
    }

    public List<IAlbergable> getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(List<IAlbergable> ocupantes) {
        this.ocupantes = ocupantes;
    }


    /// /////////////////////////////////////////////////////////////////

    public String relacionOcupantes(){

        String resultado = "";

        if( !ocupantes.isEmpty()){

            for( IAlbergable elOcupante  :  ocupantes    ){

                resultado = resultado + "\n" + elOcupante.getNombre() + " (" + elOcupante.getCargo().getDefinicion() + ")";
            }


        }else{

            resultado = "No hay ningún ocupante en " + this.denominacion;

        }



        return resultado.trim();

    }


    public void controlOcupantes(IAlbergable elOcupante){

        //comprobar si cabe un nuevo ocupante
        if(numeroOcupantesActual() < capacidadOcupantes ){

            ocupantes.add(elOcupante);

            Mensajes.mensajeSimple(elOcupante.getNombre() + " ha entrado en  el "  + this.denominacion);


        }else{

            Mensajes.mensajeSimple("No puede entrar por superar la capacidad del edificio");

        }





    }

    public int numeroOcupantesActual(){

        return ocupantes.size();
    }



    /// /////////////////////////////////////////////////////////////////






}
