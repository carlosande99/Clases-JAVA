package com.ipartek;

public enum DiasSemana {

    //Los objetos de un enumerador pueden tener métodos propios porque cada connstante
    //de un enumerador es un objeto  de esa clase
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    public boolean esFinDeSemana(){

        return this == SABADO || this == DOMINGO;
    }




}
