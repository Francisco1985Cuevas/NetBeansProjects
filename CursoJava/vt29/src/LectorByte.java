//importamos los paquetes que necesitamos
//java.io: se encuentran gran parte de las clases que necesitamos
//para crear flujos de entrada y salida en Java.
import java.io.*;


public class LectorByte {
    
    public static void main(String[] arguments) {
        
        //tratamos las excepciones que pueden ser lanzadas
        try {
            
            //Proceso para un stream de entrada
            
            //Asociar el stream con una fuente o destino de datos.
            FileInputStream archivo = new FileInputStream("clases.dat");
            
            boolean eof = false;
            int contador = 0;
            while (!eof) {
                
                int entrada = archivo.read();//usamos el metodo read() para ir leyendo la informacion del archivo, se lee de byte en byte
                System.out.print(entrada + " ");//nos vaya imprimiendo cada vez que devuelve
                if (entrada == -1){
                    eof = true;
                }else{
                    contador++;
                }
            }
            archivo.close();//cerrar stream
            
            System.out.println("\nBytes leídos: " + contador);
            
        } catch (IOException e) {//en este caso IOException es la exception capturada
            System.out.println("Error -- " + e.toString());
        }
    }
    
}