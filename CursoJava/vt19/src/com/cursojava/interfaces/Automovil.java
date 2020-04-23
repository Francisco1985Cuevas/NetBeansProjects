/*
una interfaz puede ser una forma en la que obligamos a otros
objetos de diferentes tipos a implementar ciertos metodos.

implements: indica que se tiene que implementar cierto codigo
de esa interfaz.
*/
package com.cursojava.interfaces;


public class Automovil implements Vehiculo {

    public Automovil() {
    }
    
    //aqui tenemos que implementar los metodos definidos 
    //en la interface.

    public void avanzar() {
        //aqui escribimos la funcionalidad para este metodo.
        System.out.println("El Automovil avanza!");
    }

    public void detenerse() {
        //aqui escribimos la funcionalidad para este metodo.
        System.out.println("El Automovil se detuvo!");
    }
    
}
