package com.ipartek.estatico;

import com.ipartek.models.SubUsuario;
import com.ipartek.models.Usuario;

public class Principal {


    public static void main(String[] args) {

        Usuario agustin = new Usuario("Agustín","admin");
        Usuario enrique = new Usuario("Enrique","abc");

        SubUsuario subEnrique = new SubUsuario("SubEnrique","subadmin");

        //SubUsuario. //Desde la subclase tengo acceso a los métodos y atributos static de la superclase

        agustin.metodoStatic(); //Desde el contexto no static (desde agustin que es una instancia de la clase Usuario)
        //tenemos acceso al contexto static. PERO ACCEDER DESDE UNA INSTANCIA A UN MÉTODO STATIC SE CONSIDERA UNA PÉSIMA PRÁCTICA
        //Para ello Java pone a nuestra disposición lo siguiente ( que es lo correcto):
        //Usuario.metodoStatic();

        //Usuario.metodoNoStatic(); //No es posible desde el contexto static (una clase) llamar a un método no static

    }


}
