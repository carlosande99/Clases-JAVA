package com.ipartek.sobreescritura;

import com.ipartek.models.Elfo;
import com.ipartek.models.ElfoBosques;
import com.ipartek.models.Humanoide;
import com.ipartek.models.Orco;

public class Principal2 {

    //POLIMORFIRMO DE SOBREESCRITURA

    public static void main(String[] args) {

        //La sobreescritura (overrride) consiste en modificar
        //el comportamiento de un método heredado (SOBREESCRIBIENDOLO ALLÁ DONDE ESTÉ
        //IMPLEMENTADO)
        //También se conoce como polimorfismo de inclusion o polimorfismo de runtime (no llegamos
        //a ver el método sobreescrito físicamente porque la sobreescritura se produce en
        //tiempo de compilación en la memoria del ordenador)

        Humanoide urk = new Orco("Urk",6,4);
        Elfo irwee = new ElfoBosques("Irwee",7,9);

        /*irwee.tirarConArco();
        urk.tirarConArco();

        irwee.fabricarLembas();*/

        // public String toString() {
        //        return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //    }
        String resultado = irwee.toString();
        System.out.println("resultado = " + resultado);//com.ipartek.models.ElfoBosques@30f39991

        String resultado2 = urk.toString();
        System.out.println("resultado2 = " + resultado2);//com.ipartek.models.Orco@452b3a41





    }



}
