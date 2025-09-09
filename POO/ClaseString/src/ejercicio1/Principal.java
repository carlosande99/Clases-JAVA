package ejercicio1;

public class Principal {
    public static void main(String[] args) {
        //de una consulta a una BBDD nos llega un telefono
        //con el siguiente formato *          5256284000
        //debemos dejarlo asi: *(52)-5-6284000
        //cuando tengamos el resultado sacarlo por consola

        String telefono = "*          5256284000        *";
        telefono = telefono.trim();
        System.out.println(telefono);
        char[] telef = telefono.toCharArray();
        System.out.println(telef);
        String numeroSinEspacios = "";
        String sinEspacios;
        for(char letras : telef){
            sinEspacios = String.valueOf(letras);
            if(!sinEspacios.equals(" ")){
                numeroSinEspacios = numeroSinEspacios.concat(sinEspacios);
            }
        }
        String t1 = numeroSinEspacios.substring(0,2);
        String t2 = numeroSinEspacios.substring(2,3);
        String t3 = telefono.substring(3);
        System.out.println(numeroSinEspacios);
    }
}
