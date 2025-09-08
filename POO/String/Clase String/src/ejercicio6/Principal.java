package ejercicio6;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        String palabra;
        do{
            palabra = JOptionPane.showInputDialog("Escribe salir o continuar");
            JOptionPane.showMessageDialog(null, palabra);
        }while(!palabra.toLowerCase().equals("salir"));
    }
}
