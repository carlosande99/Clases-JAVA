package com.ipartek.map.hashmap;

import java.util.*;

public class Principal12 {

    public static void main(String[] args) {
        
        //Un HashMap (como todos los Map) almacena los elementos en pares clave-valor (Key-Value ó K-V)
        //Ámbos, Key y Value, no tienen por que ser del mismo tipo. Pueden ser del mismo tipo.
        //Tanto K como V tienen que ser tipos (no valen primitivos).
        //Una cosa muy a tener en cuenta es que debemos utilizar siempre como K clases inmutables (String, Wrappers)

        Map<Integer,String> athletic = new HashMap<>();
        //Map<Integer,String> athletic = new LinkedHashMap<>();//En un LinkedHashMap el orden de entrada se respeta
        
        String valueInsertado = athletic.put(1,"Unai Simón"); //Si añado un elemento con un key que no existe el método devuelve null
        System.out.println("valueInsertado = " + valueInsertado);
        String valueInsertado2 = athletic.put(1,"Aguirrezabala");//Si añado un elemento con una key que ya existe el método devuelve el value del elemento sustituido
        System.out.println("valueInsertado2 = " + valueInsertado2);

        athletic.put(3,"Vivian");//el método devuelve null ya que la key 3 es nueva
        athletic.put(9,"Iñaki Williams");//el método devuelve null ya que la key 9 es nueva
        athletic.put(10,"Nico Williams");//el método devuelve null ya que la key 10 es nueva
        athletic.put(8,"Sancet");//el método devuelve null ya que la key 8 es nueva


        athletic.forEach(  (dorsal, nombre) -> System.out.println("El jugador con el dorsal " + dorsal + " se llama " + nombre)     );
        
        /// ///////////////////////////////////////////////////////////////////////////////////////////////
        //MÉTODOS DE UN HASHMAP
        /// ///////////////////////////////////////////////////////////////////////////////////////////////

        //put
        //Sirve para insertar datos en un Map tal y como hemos visto anteriormente
        //En el caso de que K exista , su V quedará reemplado por el nuevo V (en este caso el método devuelve el V reemplazado)
        //En el caso de que K no exista, se creará un nuevo elemento y el método nos devolverá null
        athletic.put(7,"Berenguer");

        //size
        //Devuelve el número de elementos contenidos en un Map
        int numeroJugadores = athletic.size();

        System.out.println("===========================================================================================");

        //values
        //Devuelve los V de un Map
        Collection<String> nombresJugadores = athletic.values();
        nombresJugadores.forEach(System.out::println);


        System.out.println("===========================================================================================");


        //keySet
        //Devuelve todos los K que hay en un Map en forma de Set
        Set<Integer> dorsales = athletic.keySet();
        dorsales.forEach(System.out::println);
        
        
        //isEmpty
        //Devuelve true en el caso de que el Map se encuentre vacío. En caso contrario devolverá false
        boolean resultado = athletic.isEmpty();
        System.out.println("resultado = " + resultado);//false
        
        
        //replace
        //Pasamos como primer argumento el K. Si encuentra concurrencia modifica su V con el V pasado como segundo argumento
        //devolviendo una referencia del anterior V (igual que el método put)
        //La diferencia con el método put radica en que si replace no encuentra concurrencia devuelve null Y NO CREA UN NUEVO ELEMENTO
        String nombreJugadorSustituido = athletic.replace(16,"Jaureguizar");//null y no crea un nuevo jugador
        //Podríamos comprobar que Jaureguizar no ha sido incluído en el Map
        
        //Si lo intentamos con un K que existe...por ejemplo el 8...
        String nombreJuagadorSustituido2 = athletic.replace(8,"Jaureguizar");
        System.out.println("nombreJuagadorSustituido2 = " + nombreJuagadorSustituido2);

        System.out.println("===========================================================================================");

        athletic.forEach(  (dorsal, nombre) -> System.out.println("El jugador con el dorsal " + dorsal + " se llama " + nombre)     );

        //En el método replace existe una segunda sobrecarga ( en este caso tiene que encontrar concurrencia en el K y en el V )

        boolean resultado2 = athletic.replace(8,"Jaureguizar", "Maroan Sanadi");
        System.out.println("resultado2 = " + resultado2);

        System.out.println("===========================================================================================");

        athletic.forEach(  (dorsal, nombre) -> System.out.println("El jugador con el dorsal " + dorsal + " se llama " + nombre));
        
        //get
        //Devuelve el V asignado a la K que le pasamos como argumento
        //Esto no significa que el elemento sea eliminado del Map
        
        String jugadorSeleccionado = athletic.get(8);
        System.out.println("jugadorSeleccionado = " + jugadorSeleccionado);
        
        //forEach
        //Sirve para iterar el Map. Es reseñable que nos pide un BiConsumer como argumento
        
        //clear
        //Borra completamente un Map de contenido
        athletic.clear();
        

        boolean resultado3 = athletic.isEmpty();//true


        /// //////////////////////////////////////////////////////////////////////////////////////////////////
        //TODOS ESTOS MÉTODOS A TODOS LOS MAPS (LinkedHashMap, HashMap y TreMap
        /// //////////////////////////////////////////////////////////////////////////////////////////////////


    }
    
    
}
