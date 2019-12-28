//stream de salida

//importamos los paquetes que necesitamos
import java.io.*;

public class EscribirByte {
    
    public static void main(String[] arguments) {
        
        //datos binarios para un icono
        //esto es lo que vamos a escribir posteriormente en el archivo
        int[] datos = { 71, 73, 70, 56, 57, 97, 13, 0, 12, 0, 145, 0,
            0, 255, 255, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 44, 0,
            0, 0, 0, 13, 0, 12, 0, 0, 2, 38, 132, 45, 121, 11, 25,
            175, 150, 120, 20, 162, 132, 51, 110, 106, 239, 22, 8,
            160, 56, 137, 96, 72, 77, 33, 130, 86, 37, 219, 182, 230,
            137, 89, 82, 181, 50, 220, 103, 20, 0, 59 };
        
        try {
            
            //1) creamos un objeto de la clase FileOutputStream(archivo_destino)
            //le pasamos como argumento el archivo destino donde queremos que
            //se escriba la informacion.
            //en este caso no es necesario que exista, cuando 
            //ejecutemos la aplicacion, si ya existe se sobreescribe
            FileOutputStream archivo = new FileOutputStream("pic.gif");
            
            //2) luego de crear el objeto, llamamos a su metodo write()
            for (int i = 0; i < datos.length; i++){
                archivo.write(datos[i]);//lee solo un byte, por eso usamos loop
            }
            
            //3) llamamos al metodo close()
            archivo.close();
                
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }
    //escribe la informacion que le indicamos al archivo
    //que le indicamos.
    
}