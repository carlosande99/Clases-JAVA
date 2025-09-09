package ejercicio6;

import javax.swing.*;

public class Principal10 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API Swing varias palabras separadas
        //por UN espacio (al menos cuatro palabras)
        //Sacar mediante la API Swing la tercera palabra que el usuario haya escrito

        String elMensaje = JOptionPane.showInputDialog("Escribe, al menos, cuatro palabras separadas por UN espacio");

        String[] palabras = elMensaje.split(" ");//{"pino","abeto"....}

        JOptionPane.showMessageDialog(null, "la tercera palabra ha sido: " + palabras[2]);

    }
}


