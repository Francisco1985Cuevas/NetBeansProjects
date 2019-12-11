class ConcatenacionVariable{
    public static void main(String[] args){
        
        /*
        //Ejemplo 1
        int numero = 143;
        char valor = 'M';
        System.out.println("Hubo un total de: "+numero+" participantes");
        System.out.println("Promedio "+valor);
        */
        
        /*
        //Ejemplo 2
        String palabrasClave = "";
        palabrasClave = palabrasClave + "videotutoriales";
        palabrasClave = palabrasClave + " flash";
        palabrasClave = palabrasClave + " php";
        System.out.println(palabrasClave);
        */
        
        //Ejemplo 3
        String palabrasClave = "";
        palabrasClave += "videotutoriales";
        palabrasClave += " flash";
        palabrasClave += " php";
        System.out.println(palabrasClave);
        
    }
}
