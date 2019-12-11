package vt12;

import java.awt.Point;

class ConfigurarPunto{
    public static void main(String args[]){
        Point localizacion = new Point(4, 13);
        System.out.println("Empezar localizacion:");
        
        // Accedemos a los valores que tienen estas variables(x, y) dentro de Point()
        System.out.println("X igual a "+localizacion.x);
        System.out.println("Y igual a "+localizacion.y);
        
        System.out.println("\nAsignandole nuevos valores a x,y");
        localizacion.x = 5;
        localizacion.y = 10;
        System.out.println("X igual a "+localizacion.x);
        System.out.println("Y igual a "+localizacion.y);
        
    }
}