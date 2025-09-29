package com.ipartek;

public enum Operacion  implements  ICalculadora{

    SUMAR{

        @Override
        public int calcular(int a, int b) {
            return a + b;
        }
    },


    RESTAR {
            @Override
            public int calcular(int a, int b) {
                return a - b;
            }
        };


    //Los enumeradores pueden implementar interfaces (todas las que queramos)
    //Cuando una clase (enum) implementa una interface tiene la obligación de
    //implementar sus métodos.
    //Lo podemos hacer de la manera tradicional, es decir implementarlo a nivel de clase
    //es decir la implementación es común a todos los objetos de la clase.
    //Pero en Java (de una manera indirecta) podemos hacer una implementación
    //específica para cada instancia (utilizando "clases al vuelo")

    //A nivel de clase
    /*@Override
    public int calcular(int a, int b) {
        return 0;
    }*/
}
