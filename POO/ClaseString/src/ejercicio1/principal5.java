package ejercicio1;

public class principal5 {

    public static void main(String[] args) {

        //De una consulta a una BBDD nos llega un teléfono
        //con el siguiente formato "       5256284000         "
        //Debemos dejarlo así: "(52)-5-6284000"
        //Sacar el resultado por consola

        String telefono = "       5256284000         ";

        telefono = telefono.trim();//"5256284000"
        String t1 = telefono.substring(0,2);//"52"
        String t2 = telefono.substring(2,3);//"5"
        String t3 = telefono.substring(3);// 6284000

        telefono = "("+t1+")-"+t2+"-"+t3;
        System.out.println(telefono);





    }
}
