//importamos los paquetes que necesitamos
import java.io.*;

public class LeerFuente {
    
    public static void main(String[] arguments) {
        
        try {
            //creamos un objeto FileReader y lo asociamos con un archivo fuente
            FileReader archivo = new FileReader("src\\LeerFuente.java");
            //creamos un filtro buffer que asociamos con la fuente de entrada
            BufferedReader buff = new BufferedReader(archivo);
            
            boolean eof = false;
            while (!eof) {
                String linea = buff.readLine();
                if (linea == null)
                    eof = true;
                else
                    System.out.println(linea);
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
        
    }
    
}
