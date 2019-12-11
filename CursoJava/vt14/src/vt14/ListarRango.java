package vt14;

class ListarRango{
   
    
    int[] crearRango(int inferior, int superior){
        // cuerpo del metodo
        
        // int[] indica el tipo de retorno que devuelve el metodo
        // crearRango: Nombre del metodo
        // int inferior, int superior: parametros
        
        int[] rango = new int[(superior-inferior)+1]; // Crear un array de tipo integer, le damos un valor igual a la diferencia entre (superior-inferior)
        for(int i = 0; i < rango.length; i++){
            rango[i] = inferior++;
        }
        
        return rango; // retornamos
    }
    
    
    /*
    public static void main(String args[]){
        int[] rango;
        ListarRango listar = new ListarRango();
        rango = listar.crearRango(5, 15);
       
        System.out.println("El array: [");
        for(int i = 0; i < rango.length; i++){
            System.out.print(rango[i]+" ");
        }
        System.out.println("]");
    }
    */
}
