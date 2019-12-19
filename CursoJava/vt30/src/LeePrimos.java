import java.io.*;

public class LeePrimos {
    public static void main(String[] arguments) {
        try {
            FileInputStream archivo = new FileInputStream("250primos.dat");
            BufferedInputStream buff = new BufferedInputStream(archivo);
            DataInputStream datos = new DataInputStream(buff);

            try {
                while (true) {
                    int in = datos.readInt();
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