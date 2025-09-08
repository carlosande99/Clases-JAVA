package ejercicio4;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        //Pedir al usuario mediante un panel de la API Swing que introduzca una frase
        //Sacar esta frase por un panel Message Dialog de la API Swing

        String palabra = JOptionPane.showInputDialog("Que tal?");
        String mayus = palabra.toUpperCase();
        JOptionPane.showMessageDialog(null, mayus);
    }
}
