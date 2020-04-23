/*
la diferencia entre una clase abstracta de una clase convencional
es que la clase abstracta NO se puede instanciar.
*/
package com.cursojava.claseabstracta;

public class Main {
    public static void main(String[] args){
       
       Automovil a = new Automovil("Toyota", "Funcargo-2001");
       a.setColor("Gris");
       a.setCantRuedas(4);
       a.setCantPuertas(5);
       a.setNroChasis("APK-2568LRA06");
       a.setNroChapa("YQA-996");
       a.avanzar();
       System.out.println("Caracteristicas del Automovil");
       System.out.println("Color: "+a.getColor());
       System.out.println("Cant. Ruedas: "+a.getCantRuedas());
       System.out.println("Cant. Puertas: "+a.getCantPuertas());
       System.out.println("Nro. Chasis: "+a.getNroChasis());
       System.out.println("Nro. Chapa: "+a.getNroChapa());
       a.detenerse();
       
       
       
       
       
       
       Bicicleta b = new Bicicleta();
       b.setTipo("Urbana");
       b.setColor("Rojo");
       b.setCantRuedas(2);
       b.avanzar();
       System.out.println("Caracteristicas de la Bicicleta");
       System.out.println("Tipo: "+b.getTipo());
       System.out.println("Color: "+b.getColor());
       System.out.println("Cant. Ruedas: "+b.getCantRuedas());
       b.detenerse();
    }
}
