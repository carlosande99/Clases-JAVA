package com.ipartek.puro;

import com.ipartek.models.Caballo;
import com.ipartek.models.ElfoBosques;
import com.ipartek.models.Gato;
import com.ipartek.models.Wargo;

public class Principal4 {

    public static void main(String[] args) {

        Caballo furia = new Caballo("Furia");
        Caballo trueno = new Caballo("Trueno");
        Wargo dientitos = new Wargo("Dientitos");
        Gato mizifuz = new Gato("Mizifuz");

        ElfoBosques elrond = new ElfoBosques("Elrond",9,10);

        elrond.cabalgar(dientitos);
        elrond.cabalgar(trueno);
        //elrond.cabalgar(mizifuz);



    }


}
