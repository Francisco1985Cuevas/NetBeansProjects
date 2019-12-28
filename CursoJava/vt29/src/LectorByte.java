//stream de entrada

//importamos los paquetes que necesitamos
//java.io: se encuentran gran parte de las clases que necesitamos
//para crear flujos de entrada y salida en Java.
import java.io.*;

//creamos la clase LectorByte
public class LectorByte {
    
    public static void main(String[] arguments) {
        
        //tratamos las excepciones que pueden ser lanzadas
        try {
            //vamos a seguir los pasos que indicamos para crear
            //un flujo de entrada.
            
            
            //Proceso para un stream de entrada*
            
            //Asociar el stream con una fuente o destino de datos.*
            
            //1) Crear un objeto asociado con una fuente de datos.
            //en concreto para "esta aplicacion" un objeto de la clase FileInputStream
            //FileInputStream archivo = new FileInputStream("clase.dat");
            FileInputStream archivo = new FileInputStream("clases.dat");
            
            //variables que vamos a necesitar
            boolean eof = false;
            int contador = 0;
            
            while (!eof) {//mientras sea false, siga iterandose..
                
                //2) Después que tenemos un objeto stream ya creado 
                //podemos leer información de ese stream usando uno 
                //de los métodos del objeto: FileInputStream 
                //incluye un método que se llama read()
                int entrada = archivo.read();//usamos el metodo read() para ir leyendo la informacion del archivo, se lee de byte en byte
                System.out.print(entrada + " ");//nos vaya imprimiendo cada vez que devuelve
                
                if (entrada == -1){//comprobar el valor que nos devuelve entrada
                    eof = true;
                }else{
                    contador++;
                }
            }
            //3) Cuando terminemos de leer la información desde el 
            //stream tendremos que llamar al método close() 
            //para indicar que hemos terminado de usar el stream.
            archivo.close();//cerrar stream
            
            System.out.println("\nBytes leídos: " + contador);
            
        } catch (IOException e) {//en este caso IOException es la exception capturada
            //en catch tratamos con la captura de las posibles
            //excepciones lanzadas, sabemos que son excepciones
            //que forman parte de IOException
            System.out.println("Error -- " + e.toString());
        }
    }
    
}