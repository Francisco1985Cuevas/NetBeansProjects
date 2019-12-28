
import java.io.*;

public class LeePrimos {
    
    public static void main(String[] arguments) {
        
        try {
            //la diferencia es que usa InputStream
            FileInputStream archivo = new FileInputStream("250primos.dat");
            BufferedInputStream buff = new BufferedInputStream(archivo);
            DataInputStream datos = new DataInputStream(buff);

            try {
                while (true) {
                    int in = datos.readInt(); //lee
                    System.out.print(in + " ");
                }
            } catch (EOFException eof) {
                buff.close();
            }
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
        
    }
}

//lee el archivo: 250primos.dat
//nos muestra(lee) el archivo creado por el programa EscribePrimos.java

