package com.ipartek.set.treeset_comparator.comparadores;

import com.ipartek.set.models.Estudiante;

import java.util.Comparator;

public class OrdenarEdad implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante e1, Estudiante e2) {


        int resultado =  e1.getEdad() - e2.getEdad();

        if( resultado == 0 && !e1.equals(e2)){
            return 1;
        }

        return resultado;

    }
}
