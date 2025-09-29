package com.ipartek.polimorfismo;

public enum Cargo {

    VETERINARIO("Veterinario"),
    CAPATAZ("Capataz"),
    MANTENIMIENTO("Mantenimiento"),
    AGRICULTOR("Agricultor"),
    CRIADOR("Criador"),
    CONDUCTOR("Conductor"),
    MASCOTA("Mascota"),
    ALMACENERO("Almacenero");

    private String definicion;

    Cargo(String definicion) {
        this.definicion = definicion;
    }

    public String getDefinicion() {
        return definicion;
    }
}

/// ////////////////////////////////////////////////////////
//CUANDO COMPILAMOS JAVA TRANSFORMA EL ENUM EN UNA CLASE
//FINAL QUE EXTIENDE DE Enum
/// ///////////////////////////////////////////////////////

/*public final Cargo extends Enum<Cargo>{

    public static final Cargo VETERINARIO = new Cargo();
    public static final Cargo CAPATAZ = new Cargo();
    public static final Cargo MANTENIMIENTO = new Cargo();
    public static final Cargo AGRICULTOR = new Cargo();
    public static final Cargo CRIADOR = new Cargo();
    public static final Cargo CONDUCTOR = new Cargo();
    public static final Cargo ALMACENERO = new Cargo();

    public static final String NOMBRE = "Pepito"

}*/


