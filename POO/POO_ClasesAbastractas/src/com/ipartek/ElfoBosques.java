package com.ipartek;

public class ElfoBosques extends Elfo{

    //no tiene atributos propios

    /// ////////////////////////////////////////////

    public ElfoBosques(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }




    /// /////////////////////////////////////////////


    public void hablarConAnimales(){

        System.out.println("Elfo de los bosques hablando con animales");
    }


    /// //////////////////////////////////////////////



    @Override
    public void tirarArco() {
        System.out.println("Elfo de los Bosques tirando con arco brillantemente");
    }

    @Override
    public void imponerManos() {
        System.out.println("Elfo de los Bosques imponiendo manos poderosamente");

    }



}
