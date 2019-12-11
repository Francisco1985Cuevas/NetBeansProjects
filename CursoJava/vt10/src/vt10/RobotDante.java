package vt10;

/*
- Como ejecutar un programa en Java?
* Modo 1: Crear un programa Java separado que use esta clase RobotDante.
* Modo 2: Crear el método main() en la clase.
*/
class RobotDante{ // Declarar la clase
    
    // Se crean variables de instancia, que son los atributos de nuestra clase
    String estatus;
    int velocidad;
    float temperatura;
    
    /*public static void main(String args[]){
        // Para ejecutar el programa se crea el metodo main()
    }*/
    
    void comprobarTemperatura(){    // 
        // void: Informa sobre el tipo de informacion que el metodo debera almacenar
        // comprobarTemperatura(): Nombre del metodo
        // Simpre se empieza con el nombre del metodo
        
        // Metodo de instancia (Comportamientos)
        if(temperatura > 660){
            estatus = "Volviendo a casa";
            velocidad = 5;
        }
    }
    
    void mostrarAtributos(){
        // Metodo de instancia (Comportamientos)
        System.out.println("Estatus: "+estatus);
        System.out.println("Velocidad: "+velocidad);
        System.out.println("Temperatura: "+temperatura);
    }
    
}