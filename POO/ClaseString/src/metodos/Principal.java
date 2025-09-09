package metodos;

public class Principal {
    public static void main(String[] args) {
        String hechizo = "ABRACADABRA";
        String grupoHardRock = "Deep Purple";

        int tamaño = hechizo.length();
        System.out.println(tamaño);
        String mayus = grupoHardRock.toUpperCase();
        String minus = hechizo.toLowerCase();
        //devuelve el caracter que esta en una determinada posicion
        char posi = hechizo.charAt(2);
        //extrae una cadena entre dos posiciones
        String medio = hechizo.substring(4);
        String medio2 = hechizo.substring(1,6);//metodo sobrecargado

        char[] caracteresDeHechizo = hechizo.toCharArray();

        System.out.println(mayus);
        System.out.println(minus);
        System.out.println(posi);
        System.out.println(medio);
        System.out.println(medio2);
        for (char c : caracteresDeHechizo) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println(mayus.concat(minus));
    }
}
