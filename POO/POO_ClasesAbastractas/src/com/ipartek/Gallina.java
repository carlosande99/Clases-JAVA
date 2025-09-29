package com.ipartek;

public class Gallina extends Animal{

    //no tiene atributos propios

    /// ///////////////////////////////////////////////
    public Gallina(int edad) {
        super(edad);
    }

    @Override
    public String dimeTuNombre() {
        return "Gallina Anónima";
    }

    /// /////////////////////////////////////////////





    /// ///////////////////////////////////////////////

    public void metodoGallina(){

        System.out.println("soy un metodo de gallina");
    }


}
