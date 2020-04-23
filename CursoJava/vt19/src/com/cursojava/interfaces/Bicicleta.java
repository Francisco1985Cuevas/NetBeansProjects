package com.cursojava.interfaces;


public class Bicicleta implements Vehiculo {

    public Bicicleta() {
    }
    
    //aqui implementamos la misma interface
    //y para los metodos implementados un codigo distinto

    public void avanzar() {
        System.out.println("La Bicicleta avanza!");
    }

    public void detenerse() {
        System.out.println("La Bicicleta se detuvo!");
    }
    
}
