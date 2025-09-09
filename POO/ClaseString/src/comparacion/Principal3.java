package comparacion;

public class Principal3 {

    public static void main(String[] args) {

        //Para comparar dos String no debemos utilizar el operador "==" porque lo que hace este
        //operador es comparar "los papelitos" (identityHashCode)

        String miString = new String ("árbol");
        String miString2 = new String ("árbol");
        System.out.println("El identityHashCode de miString es: " + System.identityHashCode(miString));//41359092
        System.out.println("El identityHashCode de miString2 es: " + System.identityHashCode(miString2));//713338599

        /*if(miString == miString2){//está comparando 41359092 con 713338599
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }*/

       /* if(miString.equals(miString2)){
            System.out.println("son iguales");
        }else{
            System.out.println("son diferentes");
        }*/

        String resultado = miString.equals(miString2) ? "son iguales" : "son diferentes";
        System.out.println(resultado);


    }



}
