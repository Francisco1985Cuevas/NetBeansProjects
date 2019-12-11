package vt11;

import java.awt.*; // importar el paquete que incluye esa clase Point a la que haremos referencia...

public class Punto3D extends Point{ // creamos nuestra clase, y vamos a convertirla en subclase de la clase Point()
    public int z;
    
    // Metodo Constructor
    public Punto3D(int x, int y, int z){
        super(x, y); // super hace referencia a la superclase del objeto actual
        this.z = z; // this es un modo que usamos para referenciar al actual objeto desde el que estamos ejecutando la clase
    }
    
    public void move(int x, int y, int z){
        this.z = z;
        super.move(x, y);
    }
    
    public void translate(int x, int y, int z){
        this.z += z;
        super.translate(x, y);
    }
}