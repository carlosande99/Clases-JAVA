package com.ipartek.primitivos;

import javax.swing.*;

public class Principal1 {



    public static void main(String[] args) {

        int miEntero = 8;
        miMetodo(miEntero);
        System.out.println("miEntero después de llamar al método: " + miEntero);


    }


    public static void miMetodo(int miEntero2){

        System.out.println("miEntero2 = " + miEntero2);
        miEntero2 = 9;
        System.out.println("miEntero2 = " + miEntero2);


    }



}
