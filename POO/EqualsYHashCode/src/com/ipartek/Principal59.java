package com.ipartek;

public class Principal59 {

    public static void main(String[] args) {
        
        Perro fifi = new Perro("Fifí","Azul","Blanco");
        Perro fifi2 = new Perro("Fifí","Azul","Blanco");
        Gato fifi3 = new Gato("Fifí","Azul","Blanco");

        String resultado = (fifi==fifi2) ? "son iguales" : "son diferentes";

        System.out.println("El identity hash code de Fifí es: " + System.identityHashCode(fifi));//149928006
        System.out.println("El identity hash code de Fifí 2 es: " + System.identityHashCode(fifi2));//168423058
        System.out.println("resultado = " + resultado);//son diferentes porque son objetos diferentes

        //Haciendo la comparativa con equals el resultado es el mismo!!!
        String resultado2 = (fifi.equals(fifi2))  ? "son iguales" : "son diferentes";
        System.out.println("resultado2 = " + resultado2);//son diferentes // una vez implementado el metodo equals es que son iguales

        //Esto es porque el método equals tiene una implementación, por defecto, en la clase Object muy curiosa
        //public boolean equals(Object obj) {
        //        return (this == obj); //por defecto compara con == también!!!!
        //    }


        System.out.println("cual es la clase de fifi?" + fifi.getClass());

        System.out.println("cual es el hashcode de fifi? : " +  fifi.hashCode());//-134618788
        System.out.println("cual es el hashcode de fifi2? : " +  fifi2.hashCode());//-134618788
        System.out.println("cual es el hashcode de fifi gato? : " +  fifi3.hashCode());//-134618788


        String resultado3 = (fifi.equals(fifi3))  ? "son iguales" : "son diferentes";
        System.out.println("resultado3 = " + resultado3);



        
        
        
        
    }
}
