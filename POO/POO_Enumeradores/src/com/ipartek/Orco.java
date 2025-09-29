package com.ipartek;

public class Orco {

    private String nombre;
    private static Integer nOrcos = 0;

    public Orco(String nombre) {
        this.nombre = nombre;
        nOrcos = nOrcos + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Integer getnOrcos() {
        return nOrcos;
    }

    public static void setnOrcos(Integer nOrcos) {
        Orco.nOrcos = nOrcos;
    }

    public void metodoNoStaticOrco(){
        System.out.println("Hola soy un Orco y me llamo " + nombre);
    }

    public static void metodoStaticOrco(){

        System.out.println("Somos en total " + nOrcos + " Orcos");
    }
}
