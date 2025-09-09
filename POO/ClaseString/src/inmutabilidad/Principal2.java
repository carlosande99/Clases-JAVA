package inmutabilidad;

public class Principal2 {

    public static void main(String[] args) {

        //Una clase es inmutable cuando sus objetos no pueden modificarse
        //Es el caso de la clase String
        //Vamos a demostrar la inmutabilidad de los objetos de la clase String en Java

        String parrafo = "Los Hobbits";
        String parrafo2 = parrafo;

        System.out.println(parrafo);
        System.out.println(parrafo2);


        //El identityHashCode NO ES UN PUNTERO. NO ES UNA POSICIÓN DE LA MEMORIA!!!. EN JAVA NO HAY PUNTEROS!!!
        System.out.println("El identityHashCode de parrafo es: " + System.identityHashCode(parrafo));//41359092
        System.out.println("El identityHashCode de parrafo2 es: " + System.identityHashCode(parrafo2));//41359092

        //Podemos tener la sensación ERRÓNEA que la modificación de un String es posible pero lo que hace
        //Java "por debajo" es crear un nuevo objeto porque los String SON INMUTABLES
        parrafo2 = "desayunan dos veces";


        System.out.println("El identityHashCode de parrafo es: " + System.identityHashCode(parrafo));//41359092
        System.out.println("El identityHashCode de parrafo2 es: " + System.identityHashCode(parrafo2));//713338599


        parrafo = "Los orcos";

        System.out.println("El identityHashCode de parrafo es: " + System.identityHashCode(parrafo));//168423058



    }
}
