package vt13;

import java.io.*; // importamos la clase que nos permitira leer lo que el usuario escriba por teclado.

class RaizNuevo2{
    public static void main(String args[]) throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe un numero:");
        String str = buff.readLine();
        
        int conversion = Integer.parseInt(str);
        
        System.out.println("La raiz cuadrada de "+conversion+" es "+Math.sqrt(conversion));
    }
}