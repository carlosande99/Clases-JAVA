package com.ipartek.models;

public class Elfo {

    //Este método a no ser static es polimórfico
    //y por lo tanto puede ser sobreescrito
    public void tirarConArco(){

        System.out.println("Tira con arco como Elfo");
    }


    public static void fabricarLembas(){

        System.out.println("Fabrica Lembas como Elfo");
    }


}
