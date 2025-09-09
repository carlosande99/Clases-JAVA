package inmutabilidad;

public class Principal {
    public static void main(String[] args) {
        String parrafo = "Los Hobbits";
        String parrafo2 = parrafo;



        System.out.println(System.identityHashCode(parrafo));
        System.out.println(System.identityHashCode(parrafo2));
        parrafo = "desayuna dos veces";
        System.out.println(System.identityHashCode(parrafo));
    }
}
