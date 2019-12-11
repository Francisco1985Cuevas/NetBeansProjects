package vt10;

class AplicacionRobot{
    // Crear y llamar al metodo main
    public static void main(String args[]){
        // static: estamos indicando que el metodo es un metodo de clase, por tanto
        // que es compartido por todos los objetos dentro de esta aplicacion(AplicacionRobot)
        
        // Crear un nuevo objeto de la clase RobotDante, por tanto vamos a utilizar
        // la clase como plantilla para instanciar para crear un nuevo objeto
        // de esa clase.
        RobotDante dante = new RobotDante();
        // RobotDante: El tipo de contenido es de la clase RobotDante
        // dante: el nombre que le damos
        // new: instanciar un nuevo objeto de la clase RobotDante
        
        
        // Vamos a darle valores a los tres atributos de la clase RobotDante
        dante.estatus = "explorando";
        dante.velocidad = 2;
        dante.temperatura = 510;
        // dante: nombre del objeto
        // .: sintaxis de punto
        // estatus, etc: el atributo que queremos utilizar
        
        // llamamos a uno de los metodos que creamos en la clase
        dante.mostrarAtributos();
        
        System.out.println("Incrementando velocidad a 3.");
        dante.velocidad = 3;
        dante.mostrarAtributos(); // Para ver el cambio que se ha producido
        
        System.out.println("Cambiando temperatura a 670.");
        dante.velocidad = 670;
        dante.mostrarAtributos(); // Para ver el cambio que se ha producido
        
    }
}