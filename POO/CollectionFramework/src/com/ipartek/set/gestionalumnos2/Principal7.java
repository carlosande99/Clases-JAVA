package com.ipartek.set.gestionalumnos2;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class Principal7 {


    public static void main(String[] args) {

        //Crear dos grupos de alumnos: uno de matemáticas y otro de física
        //El programa nos irá pidiendo uno a uno  el nombre del alumno.
        //Seguidamente nos pedirá el grupo en el que el alumno intenta inscribirse
        //Aparecerá una tercera ventana en la que se nos informará si el alumno
        //es admitido en el grupo elegido. Lógicamente un alumno no podrá inscribirse
        //dos veces en el mismo grupo pero si podrá hacerlo en diferentes grupos
        //Una vez que escribamos "fin" el programa nos mostrará los alumnos
        //del grupo de matemáticas y los alunmos del grupo física por separado

        Set<String> grupoMatematicas = new HashSet<>();
        Set<String> grupoFisica = new HashSet<>();
        String nombre = null;
        String grupo = null;
        String[] opciones = {"MATEMÁTICAS","FÍSICA"};

        do{

            nombre = JOptionPane.showInputDialog("Escribe el nombre del nuevo alumno o fin si quieres finalizar la inserción de datos");

            if(!nombre.equals("fin")){


                //grupo = JOptionPane.showInputDialog("En que grupo se quiere inscribir: FÌSICA o MATEMÁTICAS");
                //El método showOptionDialog devuelve -1 si lo cierras sin elegir ninguna opción (por ejemplo si cierras el cuadro con la X)
                int opcionElegida = JOptionPane.showOptionDialog(
                        null,
                        "Qué grupo eliges?",
                        "Grupos de Ciencias",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]

                );

                if( opcionElegida == 1){

                    if(grupoFisica.add(nombre)){

                        JOptionPane.showMessageDialog(null,"El alumno de nombre: " + nombre + " ha sido admitido en el grupo de Física");
                    }else{

                        JOptionPane.showMessageDialog(null,"El alumno de nombre: " + nombre + " NO ha sido admitido en el grupo de Física");
                    }

                }else if (opcionElegida == 0){

                    if(grupoMatematicas.add(nombre)){

                        JOptionPane.showMessageDialog(null,"El alumno de nombre: " + nombre + " ha sido admitido en el grupo de Matemáticas");
                    }else{

                        JOptionPane.showMessageDialog(null,"El alumno de nombre: " + nombre + " NO ha sido admitido en el grupo de Matemáticas");
                    }


                }else{

                    nombre = "fin";

                }


            }



        }while(!nombre.equals("fin"));


        System.out.println("==================================================================================");
        System.out.println("Grupo Matemáticas");
        System.out.println("==================================================================================");

        grupoMatematicas.forEach(System.out::println);

        System.out.println("==================================================================================");
        System.out.println("Grupo Física");
        System.out.println("==================================================================================");

        grupoFisica.forEach(System.out::println);

    }



}
