package com.ipartek.list.models;

import java.util.Objects;

public class Arbol implements Comparable<Arbol> {

    private String especie;
    private Double altura;


    /// //////////////////////////////////////////////////////
    public Arbol(String especie, Double altura) {
        this.especie = especie;
        this.altura = altura;
    }

    /// ////////////////////////////////////////////////////////
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
/// //////////////////////////////////////////////////////






    /// ////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Especie: " + this.especie + " - " + "Altura: " + this.altura;
    }

    //this es el Arbol que llama al método compareTo
    //o es el Arbol objeto de comparación
    @Override
    public int compareTo(Arbol o) {
        //La única condición que tenemos que cumplir en la implementación de este método
        //es que devuelva un int:
        //1) si devuelve un int mayor que 0 this gana en la comparación (o pierde)
        //2) si devuelve un int menor que 0 this pierde en la comparación (o gana)
        //3) si devuelve 0 this y o son iguales en la comparación

        //Ordenamos los árboles por altura

        /*if( this.altura > o.altura){
            return 1;
        }else if( this.altura < o.altura){
            return -1;
        }else{
            return 0;
        }*/

        //return (int) (this.altura - o.altura);

        //Es reseñable que este método compareTo es es de la clase String
        return this.especie.compareTo(o.especie);
        //return this.especie.compareTo(o.especie)*-1;//Orden alfabético inverso


    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Arbol arbol = (Arbol) o;
        return Objects.equals(especie, arbol.especie) && Objects.equals(altura, arbol.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie, altura);
    }
}
