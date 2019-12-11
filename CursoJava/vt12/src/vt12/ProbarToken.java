/*
La clase StringTokenizer: es una clase que forma parte del paquete
java.util, esta clase nos permite dividir un string en una serie de strings
mas cortos llamados tokens aplicando para ello algun caracter o caracteres
como delimitador.

*/
package vt12;

import java.util.StringTokenizer; // importamos la clase que vamos a utilizar.
        
class ProbarToken{
    public static void main(String[] args){ // metodo main() para que esta clase se pueda ejecutar en el mismo programa.
        StringTokenizer st1, st2; // Creamos dos variables del tipo StringTokenizer, que sera donde guardemos los dos objetos que vamos a crear.
        String cita1 = " TEXTO 6 -3/4"; // Creamos el string que vamos a utilizar como argumento para dividirlo utilizando StringTokenizer
        
        st1 = new StringTokenizer(cita1); // instanciamos el primer objeto de la clase StringTokenizer
        
        System.out.println("Token 1: "+st1.nextToken());
        System.out.println("Token 2: "+st1.nextToken());
        System.out.println("Token 3: "+st1.nextToken());
        
        String cita2 = "DSGR@9 32/ 25@2/17";
        st2 = new StringTokenizer(cita2, "@"); // le indicamos el caracter de separacion
        
        System.out.println("Token 1: "+st2.nextToken());
        System.out.println("Token 2: "+st2.nextToken());
        System.out.println("Token 3: "+st2.nextToken());
    }
}