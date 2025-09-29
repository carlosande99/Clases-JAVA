package com.ipartek;

public class ElfoOscuro extends Elfo{


    //no tiene metodos propios

    /// ////////////////////////////////////////

    public ElfoOscuro(String nombre, int fuerza, int inteligencia) {
        super(nombre, fuerza, inteligencia);
    }


    /// ////////////////////////////////////////////////////

    public void hacerMagiaNegra(){

        System.out.println("Elfo oscuro haciendo magia negra");

    }


    /// /////////////////////////////////////////////////////

   @Override
    public void tirarArco() {
        System.out.println("Elfo Oscuro tirando decentemente cor arco");
    }


    @Override
    public void imponerManos() {
        System.out.println("Elfo Oscuro imponiendo manos de manera débil");
    }


}
