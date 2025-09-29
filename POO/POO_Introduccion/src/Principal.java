public class Principal {


    public static void main(String[] args) {

        //terreno de juego

        Perro toby = new Perro();
        Perro dientitos = new Perro();
        Perro luna = new Perro("Lupa",5,"Labrador","Blanco");



        toby.correr();//toby es this
        dientitos.correr();//dientitos es this


        /*System.out.println(toby.color);
        System.out.println(toby.raza);
        System.out.println(toby.edad);
        System.out.println(toby.nombre);*/


        toby.setNombre("Toby");//this es Toby
        toby.setEdad(7);



        dientitos.setNombre("Dientitos");

        System.out.println(toby.getNombre());
        System.out.println(toby.getEdad());
        System.out.println(dientitos.getNombre());

        luna.setNombre("Luna");

        System.out.println(luna.getNombre());

        toby.setEdad(8);

        luna.ladrar();//this es luna
        toby.ladrar();//this es toby
        dientitos.ladrar();//this es dientitos







    }



}
