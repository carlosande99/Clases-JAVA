package com.ipartek.set.treeset_comparator.comparadores;

import com.ipartek.set.models.Estudiante;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante e1, Estudiante e2) {

        //La lógica de compare es EXACTAMENTE IGUAL a la de compareTo

        int resultado = e1.getNombre().compareToIgnoreCase(e2.getNombre());

        if(resultado == 0 && !e1.equals(e2)){

            return 1;
        }

        return resultado;

    }

}
