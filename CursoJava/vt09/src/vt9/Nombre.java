package vt9;

import java.util.*;

class Nombre{
    public static void main(String args[]){
        // Ordenar un Array
        
        // La clase Array, se encuentra dentro del paquete java.util
        
        String nombres[] = {"Miguel", "Maria", "Alberto", "Fernando", "Alejandro",
                            "Rosa", "Evaristo", "Bernardo", "Francisco", "Homero",
                            "Cristina", "Carla", "Cesar"};
        
        System.out.println("El orden original:");
        for(int i = 0; i < nombres.length; i++){
            System.out.println(i+" : "+nombres[i]+" ");
        }
        
        Arrays.sort(nombres); // Metodo sort() de la clase Array para ordenar
        System.out.println("\nEl nuevo orden:");
        for(int i = 0; i < nombres.length; i++){
            System.out.print(i+" : "+nombres[i]+" ");
        }
        System.out.println();
        
    }
}