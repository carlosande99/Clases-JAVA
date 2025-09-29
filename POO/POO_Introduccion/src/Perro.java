public class Perro {

    //ATRIBUTOS O PROPIEDADES

    private String nombre;
    private int edad;
    private String raza;
    private String color;


    //CONSTRUCTOR
    //Una clase SIEMPRE TIENE CONSTRUCTOR
    //Cuando en una clase no defines un constructor explicitamente dicha clase tiene por defecto un constructor VACÍO

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
    }


    //GETTERS Y SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {

        if(edad <= 30){
            this.edad = edad;
        }

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //MÉTODOS PROPIOS

    public void correr(){
        //implementación del método: definir programáticamente lo que hace el método
        System.out.println("Perro corriendo");
    }

    public void ladrar(){
        //System.out.println("Perro ladrando");
        System.out.println( this.nombre + " ladrando");
    }





    //SOBREESCRITURAS ETC...






}
