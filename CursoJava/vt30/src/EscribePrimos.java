//importamos el paquete que necesitamos io
import java.io.*;

public class EscribePrimos {
    public static void main(String[] arguments) {
        int[] primos = new int[250];
        int numPrimos = 0;
        // candidato: el número que puede ser primo
        int candidato = 2;
        while (numPrimos < 250) {
            if (esPrimo(candidato)) {
                primos[numPrimos] = candidato;
                numPrimos++;
            }
            candidato++;
        }
        
        //salida basada en datos
        try {
            // Escribir salida a disco
            FileOutputStream archivo = new FileOutputStream("250primos.dat");
            BufferedOutputStream buff = new BufferedOutputStream(archivo);
            DataOutputStream datos = new DataOutputStream(buff);

            for (int i = 0; i < 250; i++)
               datos.writeInt(primos[i]);//
               datos.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
        
    }

    public static boolean esPrimo(int comprobarNumero) {
        double raiz = Math.sqrt(comprobarNumero);
        for (int i = 2; i <= raiz; i++) {
            if (comprobarNumero % i == 0)
                return false;
        }
        return true;
    }
}
