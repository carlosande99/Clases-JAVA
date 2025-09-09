package ejercicio8;

import javax.swing.*;

public class Principal12 {

    public static void main(String[] args) {

        //Pedir al usuario mediante un panel de la API swing  que escriba "salir" o "continuar"
        //Una vez que elija "salir" o "continuar" aparecerá un mensaje de la API Swing
        //informándonos de la opción que acabamos de elegir
        //Si elegimos "continuar" volverá a aparecer el panel una y otra vez hasta que escriba "salir"

        String decision;

        do{

            decision = JOptionPane.showInputDialog("Escribe salir o continuar");
            JOptionPane.showMessageDialog(null, "Has elegido " + decision);


        }while(!decision.equalsIgnoreCase("salir"));

        JOptionPane.showMessageDialog(null, "Programa terminado");

    }
}
