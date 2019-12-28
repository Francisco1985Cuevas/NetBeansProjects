//creacion de Filtros
//stream filtado, datos de entrada-salida
import java.io.*;

public class EjemploBuffer {
    public static void main(String[] arguments) {
        
        int inicio = 0;
        int fin = 255;
        
        if (arguments.length > 1) {
            inicio = Integer.parseInt(arguments[0]);
            fin = Integer.parseInt(arguments[1]);
        } else if (arguments.length > 0)
            inicio = Integer.parseInt(arguments[0]);
        ArgStream as = new ArgStream(inicio, fin);
        System.out.println("\nEscribiendo: ");
        boolean exito = as.escribirStream();
        System.out.println("\nLeyendo: ");
        boolean exitoLectura = as.leerStream();
    }
}

//clase helper
class ArgStream {
    
    int inicio;
    int fin;

    ArgStream(int st, int f) {
        inicio = st;
        fin = f;
    }
    
    //escribir
    boolean escribirStream() {
        try {
            //1)Creamos un Stream de salida
            FileOutputStream archivo = new FileOutputStream("numeros.dat"); //argumento: archivo fuente
            
            //2) Filtrar un Stream
            //lo convertimos en un archivo filtrado de salida
            BufferedOutputStream buff = new BufferedOutputStream(archivo);
            
            //3) usar los metodos write(int)* o read()
            for (int salida = inicio; salida <= fin; salida++) {
                buff.write(salida);
                System.out.print(" " + salida);
            }
            
            //4) usamos el metodo close() para cerrar el stream buffered
            buff.close();
            return true;
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
    }
    
    //leer
    boolean leerStream() {
        try {
            //1)Creamos un Stream de entrada
            FileInputStream archivo = new FileInputStream("numeros.dat"); //argumento: archivo destino
            
            //2) Filtrar un Stream
            //lo convertimos en un archivo filtrado de entrada
            BufferedInputStream buff = new BufferedInputStream(archivo);
            
            //3) usar los metodos write(int) o read()*
            int in = 0;
            do {
                in = buff.read();
                if (in != -1)
                    System.out.print(" " + in);
            } while (in != -1);
            
            //4) usamos el metodo close() para cerrar el stream buffered
            buff.close();
            return true;
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
    }
}

//lo que haremos es escribir una serie de bytes a un streamOutput
//asociado con un archivo de texto y despues tambien volveremos
//a leer esos bytes

