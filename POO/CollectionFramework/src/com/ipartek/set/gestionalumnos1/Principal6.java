package com.ipartek.set.gestionalumnos1;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Principal6 {

    public static void main(String[] args) {

        //Crear un HashSet de String llamado "alumnos".
        //Los alumnos van a irse inscribiendo dinámicamente utilizando la Api Swing (JOption...)
        //El programa, por lo tanto nos ira pidiendo los nombres de los alumnos uno a uno y solo serán admitidos los no duplicados
        //En en momento en que escribamos "fin" en la JOption panel el programa nos mostrará por consola el listado de alumnos admitidos
        //y el número de alumnos


        Set<String> alumnos = new HashSet<>();
        String nombreAlumno = null;

        do{

            nombreAlumno = JOptionPane.showInputDialog("Introduce el nombre de un alumno");

            if(!nombreAlumno.equals("fin")) {

                if (alumnos.add(nombreAlumno)) {
                    JOptionPane.showMessageDialog(null, "El alumno " + nombreAlumno + " ha sido admitido");
                } else {
                    JOptionPane.showMessageDialog(null, "El alumno " + nombreAlumno + " NO ha sido admitido");
                }
            }

        }while(!nombreAlumno.equals("fin") );


        alumnos.forEach(System.out::println);



    }
}
