//uso de los streams Data de entrada-salida

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
            //escribir salida a disco
            
            
            //creamos un fileOutputStream
            FileOutputStream archivo = new FileOutputStream("250primos.dat");
            //asociar fileOutputStream con un BufferedOutputStream, tenemos guardadado en el buffer el archivo
            BufferedOutputStream buff = new BufferedOutputStream(archivo);
            //le aplicamos BufferedOutputStream el filtro DataOutputStream
            DataOutputStream datos = new DataOutputStream(buff);
            
            //llegamos a este punto a traves de los tres pasos
            //que significan estar utilizando filtros desde 
            //el primer stream que creamos a un archivo en concreto
            //que es 250primos.dat
            
            
            for (int i = 0; i < 250; i++){
               datos.writeInt(primos[i]);//escribe
            }
            
            //cerramos con close()
            datos.close();//
            
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
//al final crea el archivo: 250primos.dat
//este programa esta asociado con el archivo LeePrimos.java

//crea un archivo con los primeros 250 numeros primos

