package com.ipartek.models;

public class Usuario {

    //Tenemoos dos atributos de instancia
    private String nombre; //Este atributo pertenece al contexto no static. Es decir, a las instancias de la clase
    private String password;//Este atributo pertenece al contexto no static. Es decir, a las instancias de la clase

    //Y un atributo de clase
    private static int numeroUsuarios = 0;//Este atributo pertenece al contexto static. Pertenece a la clase

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Usuario(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static int getNumeroUsuarios() {
        return numeroUsuarios;
    }

    public static void setNumeroUsuarios(int numeroUsuarios) {
        Usuario.numeroUsuarios = numeroUsuarios;
    }

    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void metodoNoStatic(){//Este método pertenece al contexto no static. Pertenece a las instancias

        System.out.println(numeroUsuarios);
        System.out.println(this.nombre);
        metodoStatic();

    }

    public static void metodoStatic(){//Este método pertenece al contexto static. Pertenece a la clase

        //this.nombre //No es posible. No puedeo utilizar un atributo no static en el contexto static
        //metodoNoStatic() //No es posible. No puedeo utilizar un atributo no static en el contexto static
        System.out.println(numeroUsuarios);

    }


    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
