package vt8;

import java.io.File;
import static java.lang.System.out;
import java.util.Scanner;

class LoopDo{
    public static void main(String args[]){
        File archivo = new File("C:\\miArchivo.txt");
        Scanner miScanner = new Scanner(System.in);
        
        char replica;
        do{
            out.print("¿Borrar archivo?(s/n)");
            replica = miScanner.findWithinHorizon(".", 0).charAt(0);
        }while(replica != 's' && replica != 'n');
        
        if(replica == 's'){
            out.println("De acuerdo, borrando archivo...");
            archivo.delete();
        }else{
            out.println("De acuerdo, confirmado no borrar.");
        }
    }
}