package vt8;

/*importamos varias de las clases preConstruidas de Java para la creacion del programa*/
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class Juego{
    public static void main(String[] args){
       Scanner miScanner = new Scanner(System.in);
       int numIntentos = 0;
       int numAleatorio = new Random().nextInt(10) + 1; // le sumamos 1 para que no tenga en cuenta el cero
       out.println("Numero Aleatorio: "+numAleatorio);
       
        out.println("*********************************************");
        out.println("Bienvenidos al juego \"¡¡Acierta el Número!!\" ");
        out.println("*********************************************");
        out.println();
        out.print("Escribe un numero del 1 al 10:");
        int numeroEscrito = miScanner.nextInt();
        
        numIntentos++;
        while(numeroEscrito != numAleatorio){
            //out.println("Intento Número: "+numIntentos);
            out.println();
            out.println("Intento Número: "+numIntentos+", Inténtalo de nuevo...");
            out.print("Escribe un numero del 1 al 10:");
            numeroEscrito = miScanner.nextInt();
            
            numIntentos++;
            
        }
        
        out.print("Has ganado después de "+numIntentos+" intentos.");
    }
}
