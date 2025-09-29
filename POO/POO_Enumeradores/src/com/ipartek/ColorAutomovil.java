package com.ipartek;

public enum ColorAutomovil{


    //Los enumeradores heredas implícitamente de la clase Enum
    //Por lo tanto no pueden extender ningura clase (en Java no existe la herencia múltiple)
    //Otra caracteristica muy importante que tienen es que son implícitamente final. Esto quiere
    //decir que un enumerador no puede ser extendido.

    //En el momento de compilar, Java convierte el enumerador en una clase "por debajo"
    //Inmediatamente después de crear la clase ColorAutomovil invoca al constructor para
    //crear las instancias definidas en el enumerador (esas instancias las ha decidido el programador)
    //Por lo tanto un enumerador se puede definir como una clase que tiene un númro determinado de intancias
    //que son FINAl y STATIC.

    ROJO("Rojo Metálizado","RO7890"), //Java "por debajo" hace esto: ColorAutomovil ROJO = new ColorAutomovil("Rojo Metalizado","RO7890")
    AMARILLO("Amarillo Desierto","AM4455"),
    AZUL("Azul Océano","AZ1122"),
    BLANCO("Blanco Alaska","BL9966"),
    GRIS("Gris Metalizado","GR4100"); //OBSÉRVESE QUE ESTÉ ÚLTIMO OBJETO ESTÁ ANOTADO CON ";".
    //Si no vamos a definir mas línea de código  detrás de la definición de los objetos no hace falta poner el ";"
    //El ";" actúa como delimitador
    /// //////////////////////////////////////////////////////////////////

    private String colorComercial;
    private String refColor;


    /// //////////////////////////////////////////////////////////////////

    ColorAutomovil(String colorComercial, String refColor) {
        this.colorComercial = colorComercial;
        this.refColor = refColor;
    }

    /// ///////////////////////////////////////////////////////////////////
    /// Los enumeradores no tienen setters (las instancias son final y static)

    public String getColorComercial() {
        return colorComercial;
    }

    public String getRefColor() {
        return refColor;
    }

    /// /////////////////////////////////////////////////////

    public String metodoColorAutomovi(){
        return "soy el color " + this;
    }


    /// /////////////////////////////////////////////////////

    //No hace falta sobreescribir el método toString
    //porque ya está sobreescrito en la clase Enun
    //y por lo tanto lo heredan (sobreescrito) todos los enumeradores


}
