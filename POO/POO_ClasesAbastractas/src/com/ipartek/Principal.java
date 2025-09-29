package com.ipartek;

public class Principal {

    public static void main(String[] args) {

        ElfoOscuro irwee = new ElfoOscuro("Irwee",9, 10);
        ElfoBosques elrond = new ElfoBosques("Elrond",7,9);
        Orco urk = new Orco("Urk",6,4);

        Caballo trueno = new Caballo(8,"Trueno");
        Caballo rayo = new Caballo(7,"Rayo");
        Caballo furia = new Caballo(9,"Furia");
        Wargo dientitos = new Wargo(4,"Dientitos");
        Gallina turuleta = new Gallina(4);


        urk.tirarArco();
        elrond.tirarArco();
        irwee.tirarArco();

        irwee.imponerManos();
        elrond.imponerManos();


        urk.cabalgar(dientitos);
        elrond.cabalgar(rayo);
        irwee.cabalgar(turuleta);

        //ElfoOscuro irweeSinDisfraz = (ElfoOscuro) irwee;//downcast



    }


}
