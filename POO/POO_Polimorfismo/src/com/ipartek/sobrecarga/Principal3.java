package com.ipartek.sobrecarga;

import com.ipartek.models.Gato;

public class Principal3 {

    public static void main(String[] args) {

        //POLIMORFISMO DE SOBRECARGA

        Gato gatoCallejero = new Gato();
        Gato silvestre = new Gato(7,"Silvestre","negro");
        Gato mizifuz = new Gato("Mizifuz");
        Gato zafiron = new Gato("Zafirón","crema");
        Gato felix = new Gato(6,"Felix");

        /*System.out.println(gatoCallejero);
        System.out.println(silvestre);
        System.out.println(mizifuz);
        System.out.println(zafiron);
        System.out.println(felix);*/

        String maullido = gatoCallejero.maullar();
        System.out.println(maullido);

        String maullido2 = zafiron.maullar(6);
        System.out.println(maullido2);

        String maullido3 = felix.maullar("Marramiaguhg!!!");
        System.out.println(maullido3);

        String maullido4 = mizifuz.maullar(5,"Marramiaughtttt!!!");
        System.out.println(maullido4);



    }


}
