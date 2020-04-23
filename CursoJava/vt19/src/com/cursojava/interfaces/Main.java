/*
las dos clases debido a que implementan la interface Vehiculo
pueden utilizar el metodo avanzar(), pero los resultados son
diferentes.
simplemente implementan la misma interfaz, que los "obliga" a 
implementar codigo para esos metodos en especifico y tiene que
ser asi, porque puede ser diferente tanto para el Automovil
como para la bicicleta
*/
package com.cursojava.interfaces;

public class Main {
    public static void main(String[] args){
        
        Automovil a = new Automovil();
        
        Bicicleta b = new Bicicleta();
        
        a.avanzar();
        
        b.avanzar();
    }
}
