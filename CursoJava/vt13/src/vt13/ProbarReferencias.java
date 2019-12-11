package vt13;

import java.awt.Point;

class ProbarReferencias{
    public static void main(String args[]){
        Point pt1, pt2; // Creamos dos variables de tipo Point
        
        pt1 = new Point(100, 100); // Creamos un nuevo objeto de la clase Point()
        pt2 = pt1; // guardamos en la variable pt2 una "referencia" a el objeto que hemos almacenado en pt1
        //System.out.println("Vemos los valores en la variable pt1");
        //System.out.println("pt1: "+pt1.x);
        //System.out.println("pt1: "+pt1.y);
        //System.out.println("Vemos los valores en la variable pt2");
        //System.out.println("pt2: "+pt2.x);
        //System.out.println("pt2: "+pt2.y);
        

        // ¿Que ocurre si modificaremos los valores en pt1? ¿Que pasa con pt2?
        pt1.x = 200;
        pt1.y = 200;
        System.out.println("Vemos los valores en la variable pt1 Modificado");
        System.out.println("pt1: "+pt1.x);
        System.out.println("pt1: "+pt1.y);
        System.out.println("Vemos los valores en la variable pt2");
        System.out.println("pt2: "+pt2.x);
        System.out.println("pt2: "+pt2.y);
        
        //pt2 = new Point(100, 100);
        //System.out.println("pt2: "+pt2.x);
        //System.out.println("pt2: "+pt2.y);
    }
}