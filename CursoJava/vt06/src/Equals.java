class Equals{
    public static void main(String[] args){
        
        //ejemplo de uso del metodo equals()
        
        String respuesta = "amarillo";
        //String resultado = "verde";
        String resultado = "amarillo";
        
        System.out.println("¿Has respondido que el color es "+resultado+"?");
        System.out.println("Respuesta: "+respuesta.equals(resultado));
        // Compara si variable "respuesta" == "resultado"
        
        int tam = respuesta.length(); // Devuelve el tamaño del string
        System.out.println(tam);
        
    }
}