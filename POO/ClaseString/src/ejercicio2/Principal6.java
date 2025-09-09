package ejercicio2;

public class Principal6 {

    public static void main(String[] args) {

        //Partiendo de un texto "Rubber Soul"
        //separarlo en dos cadenas "Rubber" y "Soul"
        //Vamos a hacerlo de dos formas
        //1) utilizando substring
        //2) utilizando split
        //Sacar ambos resultado por consola

        String disco = "Rubber Soul";

        //METODO SUBSTRING
        String p1 = disco.substring(0,6);//"Rubber"
        String p2 = disco.substring(7);//"Soul"
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("==================================================================");

        //METODO SPLIT
        String[] palabras = disco.split(" ");
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);




    }


}
