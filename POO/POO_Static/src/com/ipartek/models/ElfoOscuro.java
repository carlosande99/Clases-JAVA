package com.ipartek.models;

public class ElfoOscuro extends Elfo{


    public void hacerMagiaNegra(){
        System.out.println("Elfo oscuro haciendo magia negra");
    }

    @Override
    public void tirarConArco() {
        System.out.println("Tirar con arco como Elfo Oscuro");
    }

    //@Override
    //Este método NO ESTÁ SOBREESCRIBIENDO EL MÉTODO fabricarLembas()
    //EN LA CLASE ELFO!. LO ESTÁ OCULTANDO
    //HEMOS LOGRADO QUE LAS INSTANCIAS DE LA CLASE ELFOOSCURO TENGAN
    //ESTE COMPORTAMIENTO PERSONALIZADO. PERO SOLO COMO ELFOS OSCUROS!!!
    //PODEMOS OCULTAR UN MÉTODO STATICO EN UNA SUBCLASE PERO NO PODEMOS
    //SOBREESCRIBIRLO
    public static void fabricarLembas(){
        System.out.println("Fabricar lembas como Elfo oscuro");
    }
}
