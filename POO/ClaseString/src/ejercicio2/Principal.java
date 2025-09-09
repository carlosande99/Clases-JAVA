package ejercicio2;

public class Principal {
    public static void main(String[] args) {
        String texto = "Rubber Soul";
        String rubber = texto.substring(0,6);
        String soul = texto.substring(7);
        System.out.println(rubber);
        System.out.println(soul);

        String[] rubber2 =  texto.split("Rubber ");
        String[] soul2 =  texto.split(" Soul");

        for(String datos2 : soul2){
            System.out.printf(datos2);
        }
        System.out.println();
        for(String datos : rubber2){
            System.out.printf(datos);
        }


    }
}
