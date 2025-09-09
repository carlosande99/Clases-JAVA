package ejercicio7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Principal11 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API Swing que escriba una palabra
        //Guardar la palabra en un ArrayList
        //Sacar por consola el contenido del ArrayList
        //utilizando un "for each" tradicional

        String laPalabra = JOptionPane.showInputDialog("Escriba una palabra");

        List<String> miLista = new ArrayList<>();

        miLista.add(laPalabra);

        for( String p  :  miLista  ){

            System.out.println(p);

        }




    }


}
