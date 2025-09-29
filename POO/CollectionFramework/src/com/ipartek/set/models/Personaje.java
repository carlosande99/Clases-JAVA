package com.ipartek.set.models;

import java.util.Objects;

public class Personaje extends Humanoide implements Comparable<Personaje>{

    private String tipo; //Orco, Elfo....
    private Integer fuerza;
    private Integer inteligencia;

    /// /////////////////////////////////////////////////////////

    public Personaje(String tipo, Integer fuerza, Integer inteligencia) {
        this.tipo = tipo;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    /// //////////////////////////////////////////////////////////


    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }



    /// /////////////////////////////////////////////////////////////////






    /// ////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Personaje{" +
                "tipo='" + tipo + '\'' +
                ", fuerza=" + fuerza +
                ", Inteligencia=" + inteligencia +
                '}';
    }


    //this. personaje1
    //o personaje2
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(this.tipo, personaje.tipo) && Objects.equals(this.fuerza, personaje.fuerza) && Objects.equals(this.inteligencia, personaje.inteligencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.tipo, this.fuerza, this.inteligencia);
    }



    @Override
    public int compareTo(Personaje o) {

        //return this.fuerza - o.fuerza;//no podemos retornar 0 (alegremente)  poque podría darse el caso
        //de tener dos objetos con la misma fuerza siendo diferentes mediante el criterio de equals

        /*int resultado =  this.fuerza - o.fuerza;

        if( resultado == 0  && !this.equals(o)){

            return 1;//En caso de igualdad colocamos a this primero
        }


        return resultado;*/


        int resultado = this.fuerza - o.fuerza;
        int resultadoInteligecia = this.inteligencia - o.inteligencia;


        if(resultado == 0 && resultadoInteligecia == 0 ){
            return 0;
        }else {
            return 1;
        }


    }



    /*int resultado = this.fuerza - o.fuerza;
    int resultadoInteligecia = this.inteligencia - o.inteligencia;


      if(resultado == 0 && resultadoInteligecia == 0 && !this.equals(o.tipo)){
        return 0;
    }else {
        return 1;
    }*/


    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(tipo, personaje.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tipo);
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(fuerza, personaje.fuerza);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fuerza);
    }*/
}
