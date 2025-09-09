package ejercicio9;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal13 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API Swing
        //que escriba una palabra
        //Esa palabra la vamos a meter en un ArrayList llamado "palabras"
        //El programa nos irá pidiendo una nueva palabra hasta que escribamos la
        //palabra "salir".
        //Solo vamos a admitir en el ArrayList palabras que empiecen por la letra "a"
        //Cada vez que una palabra sea admitida nos saldrá un mensaje "palabra admitida"
        //o "palabra no admitida"
        //Todas aquellas palabras admitidas serán introducidas en mayúsculas
        //Además tendremos cuidado de que el usuario no deje espacios en blanco
        //En el momento en que el usuario escriba salir el programa dejará de pedirnos
        //nuevas palabras nos sacará un mensaje "programa terminado"
        //Sacar por consola mediante un For Each tradicional el contenido del ArrayList

        String palabra;
        List<String> palabrasEmpiezanConA = new ArrayList<>();

        do{
            palabra = JOptionPane.showInputDialog("Escribe una palabra que empiece con \"a\". Si escribes \"salir\" el programa terminará ");
            palabra = palabra.trim().toUpperCase();//Limpiamos el String introducido de espacios en blanco y lo convertimos en mayúsculas
            //palabra = palabra.toUpperCase();
            if( !palabra.equalsIgnoreCase("SALIR")){

                if(palabra.startsWith("A")){
                    palabrasEmpiezanConA.add(palabra);
                    JOptionPane.showMessageDialog(null, "Has introducido en el listado la palabra: " + palabra);
                }else{
                    JOptionPane.showMessageDialog(null, "La palabra " + palabra + " no ha sido admitida" );
                }


            }



        }while(!palabra.equalsIgnoreCase("SALIR"));

        JOptionPane.showMessageDialog(null, "Programa terminado!!!" );


        System.out.println(palabrasEmpiezanConA);


        /*for(  String p   :  palabrasEmpiezanConA   ){

            System.out.println(p);
        }*/


    }
}
