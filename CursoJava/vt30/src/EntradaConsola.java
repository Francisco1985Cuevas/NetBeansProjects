//importamos los paquetes que necesitamos
import java.io.*;

public class EntradaConsola {
    
    public static String leerLinea() {
        
        StringBuffer respuesta = new StringBuffer(); //variable string buffer
        
        try {
            //crear un objeto bufferString
            BufferedInputStream buff = new BufferedInputStream(System.in);
            
            int in = 0;
            char inChar;
            do {
                in = buff.read();//metodo read de bufferedinputstream
                inChar = (char) in;//cast para convertir ese integer en un char
                if ((in != -1) & (inChar != '\n') & (inChar != '\r')) {
                    respuesta.append(inChar);
                }
            } while ((in != -1) & (inChar != '\n') & (in != '\r'));
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
