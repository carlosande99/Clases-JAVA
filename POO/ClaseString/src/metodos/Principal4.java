package metodos;

public class Principal4 {

    public static void main(String[] args) {

        String hechizo = "ABRACADABRA";
        String grupoHardRock = "Deep Purple";

        //Método lenght
        //Devuelve el número de caracteres que tiene un String
        int numeroDeCaracteres = hechizo.length();
        System.out.println("numeroDeCaracteres = " + numeroDeCaracteres);//11

        //Método toUpperCase
        //Convierte en mayúsculas los caracteres de un String
        String grupopHardRockMayusculas = grupoHardRock.toUpperCase();

        //Método tLowerCase
        //Convierte en minusculas los caracteres de un String
        String hechizoMinusculas = hechizo.toLowerCase();


        //Método charAt
        //Devuelve el caracter que se encuentra en una determinada posición pasada como argumento
        char elCaracterOcho = grupoHardRock.charAt(8);

        //Método subString
        //Extrae una subcadena entre dos posiciones. La primera posicion es 0
        //Vamos a utilizar la primera sobrecarga
        String subcadenaHechizo = hechizo.substring(4); //El índice de inicio es inclusivo CADABRA
        //Vamos a utilizar la segunda sobrecarga
        hechizo.substring(1,6);//el indice de inicio es inclusivo y el del final es exclusivo BRACA

        //Método toCharArray
        //Convierte un String en un Array de caracteres
        char[] caracteresDeHechizo = hechizo.toCharArray();//{'A','B','R'....}

        //Método concat
        //Es una forma mas eficiente de concatener Strings como alternativa de utilizar el tradicional "+"
        String resultado = grupoHardRock.concat(hechizo);

        //Método trim
        //Limpia espacios en blanco delante y detrás de una cadena

        String pelicula = "        Dune       ";
        String peliculaLimpia = pelicula.trim(); //"Dune"


        //Método split
        //Separa una cadena en varias subcadenas utilizando un patrón como operador (que es lo que se pasa como argumento)
        //Devuelve un array de Strings

        String miFrase = "Mas vale pájaro en mano que ciento volando";

        //Primera sobrecarga
        String[] resultado2 = miFrase.split(" ");//{"Mas","vale"....}


        for( String laPalabra : resultado2   ){

            System.out.println(laPalabra);

        }

        System.out.println("=====================================================================");

        //Segunda sobrecarga

        String[] resultado3 = miFrase.split(" ",4);// El límite es exclusivo

        for( String laPalabra : resultado3   ){

            System.out.println(laPalabra);

        }

        //Metodo replace
        //Sustituye un caracter por otro dentro de un String
        String hechizoRaro = hechizo.replace("A","I");
        System.out.println(hechizoRaro);//IBRICIDIBRI


        //Metodo endsWith
        //Devuelve un boolean indicando si el String termina con la cadena pasado como argumento
        String nombreArchivo = "flores.png";
        /*boolean resultado5 = nombreArchivo.endsWith(".png");
        System.out.println(resultado5);*/
        
        String resultado6 = nombreArchivo.endsWith(".png") ? "si" : "no";
        System.out.println("resultado6 = " + resultado6);


        //Metodo startWith
        //Devuelve un boolean indicando si el String comienza con la cadena pasado como argumento

        String resultado7 = hechizo.startsWith("ABRACA") ? "SI" : "NO";
        System.out.println("resultado7 = " + resultado7);

    }



}
