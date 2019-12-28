//importamos el paquete java.io
import java.io.*;

public class EntradaConsola {
    
    public static String leerLinea() {
        
        //creamos una variable string Buffer
        //una variables stringBuffer es como un string, pero 
        //puede ser modificada
        StringBuffer respuesta = new StringBuffer();
        
        try {
            
            //creamos un objeto BufferedInputStream al que le pasamos
            //como argumento la variable System.in que es la que va a
            //servir para recibir las entradas desde el teclado.
            BufferedInputStream buff = new BufferedInputStream(System.in);
            
            //aqui es donde iremos recibiendo o guardando la 
            //informacion que se recoge del teclado a traves de 
            //System.in
            int in = 0;
            char inChar;//aqui convertiremos el byte a character
            
            do {
                //metodo read de BufferedInputStream para leer 
                //las teclas que se vayan pulsando
                in = buff.read();
                
                //cast para convertir ese integer en un char
                inChar = (char) in;
                
                if ((in != -1) & (inChar != '\n') & (inChar != '\r')) {
                    //usamos un condicional para determinar si ese nuevo char
                    //que tenemos almacenado en inChar tiene que ser anhadido
                    //dentro de nuestro StringBuffer o no (respuesta).
                    
                    //cuando es -1 es el final de lo que nos esta devolviendo
                    respuesta.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
            
            //metodo close(), cerrar el BufferedInputStream
            buff.close();
            
            return respuesta.toString();
            
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
        
    }

    public static void main(String[] arguments) {
        System.out.print("\n¿Cuál es tu nombre? ");
        String entrada = EntradaConsola.leerLinea();
        System.out.println("\nHola, " + entrada);
    }
    
}
