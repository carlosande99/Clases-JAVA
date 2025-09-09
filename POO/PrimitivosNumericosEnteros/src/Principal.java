public class Principal {


    public static void main(String[] args) {

        byte miValorByte = -128; // 8 bits. Solo utilizamos 7 bits porque uno es para el signo
        short miValorShort = 32767; // 16 bits. Solo utilizamos 15 bits porque uno es para el signo
        int miValorInt = 2147483647; // 32 bits. Solo utilizamos 31 bits porque uno es para el signo
        long miValorLong = 756869798798998696L; //64 bits

       // miValorByte.    //los primitivos NO TIENEN PROPIEDADES NI MÉTODOS
        //Todos los primitivos tienen "hermanos mayoares" llamados Wrappers
        //En la práctica su manejo es idéntico

        Byte miObjetoByte = -128;
        //miObjetoByte. //los objetos TIENEN PROPIEDADES Y MÉTODOS


        System.out.println(miValorByte);


    }



}
