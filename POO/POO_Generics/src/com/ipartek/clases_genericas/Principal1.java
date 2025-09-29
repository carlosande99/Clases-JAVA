package com.ipartek.clases_genericas;

public class Principal1 {

    public static void main(String[] args) {
        
        Caja laCaja = new Caja("hola");
        System.out.println("laCaja = " + laCaja);
        
        //Es AQUÍ donde el programador que tipoo es T
        //cuando el programador crea la instancia
        CajaG<String> laCajaG = new CajaG<>("Adios");
        System.out.println("laCajaG = " + laCajaG);
        Vaca pepita = new Vaca("Pepita");
        CajaG<Vaca> laCajaGVaca = new CajaG<>(pepita);

        miMetodo(laCajaG);
        //miMetodo((laCajaGVaca));
        //miMetodo(laCaja);

        
        
    }


    public static void miMetodo(CajaG<String> c){


    }
   
}
