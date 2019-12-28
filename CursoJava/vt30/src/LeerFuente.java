//importamos los paquetes que necesitamos
import java.io.*;

public class LeerFuente {
    
    public static void main(String[] arguments) {
        
        try {
            //repetimos en proceso, en este caso streams de entrada.
            
            //creamos un objeto FileReader y lo asociamos con un 
            //archivo fuente.
            FileReader archivo = new FileReader("src\\LeerFuente.java");
            
            //creamos un filtro buffer que asociamos con la 
            //fuente de entrada, que acabamos de crear y al que
            //llamamos archivo
            BufferedReader buff = new BufferedReader(archivo);
            
            boolean eof = false;
            while (!eof) {//mientras no sea fin de archivo
                String linea = buff.readLine();//lee linea a linea del archivo fuente
                if (linea == null){
                    eof = true;
                }else{
                    System.out.println(linea);
                }
            }
            
            //metodo close
            buff.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
        
    }
    
}
//lectura de archivo.
//vamos a hacer que el programa se lea asimismo.
