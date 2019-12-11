package vt16;

import java.awt.Point;

class NombrePunto extends Point{    //subclase de Point
    String nombre; //variable de instancia

    NombrePunto(int x, int y, String nombre){ //metodo constructor
        //la llamada al super debe ser lo primero en el metodo constructor.
        super(x, y); // llama al constructor de la superclase Point
        this.nombre = nombre; //se refiere a la variable de instancia que tenemos en la clse
    }
    
    public static void main(String[] arguments){
        NombrePunto np = new NombrePunto(5, 5, "PuntoEncuentro");
        System.out.println("x es "+np.x);
        System.out.println("y es "+np.y);
        System.out.println("Nombre es "+np.nombre);
    }
}
