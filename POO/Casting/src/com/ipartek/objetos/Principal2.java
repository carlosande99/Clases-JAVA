package com.ipartek.objetos;

public class Principal2 {

    public static void main(String[] args) {
        
        Animal gumersindaDisfrazada = new Vaca("Gumersinda");
        
         /// ////////////////////////////////////////////////////////////////
         //DOWNCAST
         /// /////////////////////////////////////////////////////////////
        
        //Castillo elCastillo = (Castillo)gumersindaDisfrazada;
        //Hay veces en el que el IDE te la incompatibilidad de los tipos (como en este caso) PERO HAY VECES QUE NO!!!
        
        //Para hacer un downcast tenemos que ESTAR SEGUROS de que gumersindaDisfrazada es una Vaca
        //porque la mayoría de las veces el propio IDE no tiene suficientes datos como para avisarnos de que
        //la presunta operación de casteo que estamos intentando hacer no puede llevarse a buen fin.
        //¿Qué tenemos que hacer para estar seguros?
        String resultado = (gumersindaDisfrazada instanceof  Vaca) ? "Es una vaca" : "No es una vaca";
        System.out.println("resultado = " + resultado);

        //en este punto estamos ABSOLUTAMENTE SEGUROS  que el casteo se efectuará correctamente
        Vaca gumersinda = (Vaca)gumersindaDisfrazada;
        gumersinda.metodoVaca(); //vuelvo a recuperar el metodo de Vaca


        /// ////////////////////////////////////////////////////////////////
        //UPCAST
        /// /////////////////////////////////////////////////////////////

        Object gumersindaDisfrazadaDeObjecto = (Object) gumersinda;
        //gumersinda ha perdido todos los métodos y atributos de Vaca y de Animal

        Animal gumersindaDisfrazadaDeAnimal = (Animal)gumersinda;
        //gumersinda ha perdido todos los métodos de Vaca


        //ERRORES DE CASTING

        String miString = "The Beatles";
        //Integer miInteger = (Integer)miString; //Tipos incompatibles


        Integer miInteger2 = 34;//autoboxing

        //Long miLong = (Long)miInteger2;//Tipos incompatibles

        Number miNumber = (Number)miInteger2;
        
        
        
    }
    
    
}
