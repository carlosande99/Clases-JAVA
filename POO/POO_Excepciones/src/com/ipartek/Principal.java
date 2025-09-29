package com.ipartek;

public class Principal {

    public static void main(String[] args) {

        String[] nombres = {"Juanito","Pepito","Jaimito"};
        Integer[] numeros = {4,8,0};

        System.out.println("Aquí empieza el programa");

        //String elNombre = nombres[25];//ArrayIndexOutOfBoundsException

        Integer elNumero = null;
        String elNombre = null;

        try{

            miMetodo(numeros);
            //elNumero = numeros[1] / numeros[2];//ArithmeticException
             elNumero = numeros[2];
            System.out.println("Si se produce un error en la linea anterior todo lo que hay de aquí para abajo no se va a leer. Ni siquiera esta explicación");
            elNombre = nombres[25];//ArrayIndexOutOfBoundsException
            elNumero++;//NullPointerException


        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Has intentado llamar a un índice del Array fuera de rango");

        }catch(NullPointerException e){

            System.out.println("Se ha producido un NullPointerException");

        }catch(DivisionEntreCeroException e){

            System.out.println(e.getMessage());

        }finally{

            System.out.println("Esto se va a leer siempre");
        }



        System.out.println("Llegamos al final del programa");

    }


    public static void miMetodo(Integer[] elArray){

        miMetodo2(elArray);
    }

    public static void miMetodo2(Integer[] elArray){

        miMetodo3(elArray);
    }

    public static void miMetodo3(Integer[] elArray){

        /*try{
            miMetodo4(elArray);
        }catch(ArithmeticException e){
            System.out.println("La excepción ha sido tratada en el miMetodo3");
        }*/

        miMetodo4(elArray);

    }

    public static void miMetodo4(Integer[] elArray){

        miMetodo5(elArray);

    }

    public static void miMetodo5(Integer[] elArray){

        //Aquí es donde se produce un ArithmeticException
        //El JVM va a intentar buscar un catn en este método
        //pero no lo va a encontrar
        //En consecuencia va a intentar buscar un catch en el método invocante (miMetodo4)
        //(y así sucesivamente)
        //siguiendo el orden inverso en el stack trace



        if(elArray[2] == 0){
            throw new DivisionEntreCeroException("Se ha producido una división entre 0");
        }else{
            Integer resultado = elArray[1] /elArray[2];
        }



    }





}
