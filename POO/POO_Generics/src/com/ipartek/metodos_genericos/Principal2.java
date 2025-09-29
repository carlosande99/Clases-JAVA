package com.ipartek.metodos_genericos;

public class Principal2 {

    public static void main(String[] args) {

        String[] nombres = {"Juanito","Jorgito","Jaimito"};
        Integer[] numeros = {1,456,23,167};


        Gato mizifuz = new Gato("Mizifuz",4);
        Gato zafiron = new Gato("Zafiroón",6);

        Gato[] gatos = { mizifuz,zafiron};

        //El el programador quien decide el tipo de dato que es T (en este caso)
        //en el momento de llamar al método
        //Utilidades.imprimirArrayString(nombres);
        Utilidades.imprimirArray(nombres);

        System.out.println("=============================================");

        //Utilidades.imprimirArrayEnteros(numeros);

        Utilidades.imprimirArray(numeros);

        System.out.println("=============================================");

        Utilidades.imprimirArray(gatos);

    }
}
