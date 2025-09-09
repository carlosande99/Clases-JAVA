package ejercicio7;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        //Pedir al usuario mediante un panel de la api swing que escriba una palabra
        //Esa palabra la vamos a meter en un ArrayList llamado "palabras"
        //El programa nos irá pidiendo una nueva palabra hasta que escribamos la palabra "salir"
        //Solo vamos a admitir en el ArrayList palabras que empiecen por la letra "a"
        //Cada vez que una palabra sea admitidas nos saltrá un mensaje "palabra admitida"
        //Todas aquellas palabras admitidas serán introducidas en mayúscula
        //Además tendremos cuidado de que el usuario no deje espacios en blanco
        //En el momento en que el usuario escriba salir el programa dejará de pedirnos nuevas palabras
        //Sacar por consola mediante un for each tradicional el contenido del ArrayList

        String mensajeDelUsuario;
        String comprobacion;
        List<String> miLista = new ArrayList<>();
        char letra;
        do {

            mensajeDelUsuario = JOptionPane.showInputDialog("Escriba salir o continuar");

            mensajeDelUsuario = mensajeDelUsuario.toLowerCase();
            letra = mensajeDelUsuario.charAt(0);
            comprobacion = Objects.toString(letra);

            if (comprobacion.equals("a")){
                miLista.add(mensajeDelUsuario);
                JOptionPane.showMessageDialog(null, "Palabra admitida");
            } else if (mensajeDelUsuario.equals("salir")){
                JOptionPane.showMessageDialog(null, "Ha elegido salir");

            }
            else {
                JOptionPane.showMessageDialog(null, "Palabra no admitida");

            }
            mensajeDelUsuario = mensajeDelUsuario.toUpperCase();


        } while (!mensajeDelUsuario.equals("SALIR"));
        for (String palabra : miLista){
            System.out.println(palabra);
        }
    }
}
