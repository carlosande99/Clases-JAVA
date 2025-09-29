package com.ipartek;

public enum OperacionMatematica {

    //Como hacemos la sobreescritura de un método abstracto en un enumerador?


    SUMAR ("hola"){
        @Override
        public int aplicar(int a, int b) {
            return a + b;
        }
    },
    RESTAR("adios"){
        @Override
        public int aplicar(int a, int b) {
            return a - b;
        }
    },
    MULTIPLICAR("hasta mañana"){
        @Override
        public int aplicar(int a, int b) {
            return a * b;
        }
    };

    private String atributo1;

    OperacionMatematica(String atributo1) {
        this.atributo1 = atributo1;
    }

    //Un enumerador puede tener métodos abstractos. Pero como es final no puede ser extendida.
    //La consecuencia sería que nunca va a tener un subclase que sobreescriba el método.
    //Java tiene un mecanismo que consigue que cada objeto del enumerador pueda tener su implementación
    //a partir de un método abstracto de comun del enumerador
    public  abstract  int aplicar(int a, int b);


}
