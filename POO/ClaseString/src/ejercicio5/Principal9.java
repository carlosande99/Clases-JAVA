package ejercicio5;

import javax.swing.*;

public class Principal9 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API Swing que escriba una palabra o una frase
        //en minúscula y sacarla mediante otro panel de la API Swing en mayúsculas


        //String elMensaje = JOptionPane.showInputDialog("Escribe una frase en minúsculas");

        /*elMensaje = elMensaje.toUpperCase();

        JOptionPane.showMessageDialog(null, elMensaje);*/

        /*JOptionPane.showMessageDialog(null, elMensaje.toUpperCase());*/

        JOptionPane.showMessageDialog(null, JOptionPane.showInputDialog("Escribe una frase en minúsculas").toUpperCase());


    }
}
