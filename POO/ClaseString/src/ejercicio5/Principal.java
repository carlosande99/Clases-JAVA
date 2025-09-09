package ejercicio5;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Dime varias palabras");
        String[] palabras = palabra.split(" ");
        JOptionPane.showMessageDialog(null, palabras[2]);
    }
}
