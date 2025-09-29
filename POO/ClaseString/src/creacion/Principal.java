package creacion;

public class Principal {

    public static void main(String[] args) {

        //Creación de objetos String de manera literal
        //La clase String es una "privilegiada" dentro de Java ya que
        //Java nos permite crear objetos String sin la necesidad de la
        //utilización explícita de un constructor

        String miString = "Los orcos";
        String miString2 = "tienen malas pulgas";
        String espacio = " ";

        //Los String se pueden concatenar con el operador "+"
        String mensaje = miString + espacio + miString2;

        //Otra forma mas eficiente de concatenar String es utilizando el método "concat"
        String mensaje2 = miString.concat(espacio).concat(miString2);


        //También podemos crear objetos String utilizando sus constructores
        String miString3 = new String("Hola mundo!!!");






    }



}
