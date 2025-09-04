package creacion;

public class Principal {
    public static void main(String[] args) {
        String miString = "Los orcos";
        String miString2 = "tienen malas pulgas";
        String espacio = " ";
        String mensaje = miString + espacio + miString2;

        String mensaje2 = miString.concat(espacio).concat(miString2);

        String miString3 = new String ("Hola mundo!");
    }
}
