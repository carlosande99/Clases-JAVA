public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private String color;


    public void correr(){
        System.out.println("Perro corriendo");
    }

    public Perro(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }

    public void ladrar(){
        System.out.println("Perro ladrando");
        System.out.println(this.getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
