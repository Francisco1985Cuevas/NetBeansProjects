package vt14;

class Exec_ListarRango{
   
    public static void main(String args[]){
        // Creamos el metodo main para poder ejecutar la clase ListarRango
        
        int[] rango; // creamos una variable de tipo array, variable local
        ListarRango listar = new ListarRango(); // creamos un objeto de la clase ListarRango[Tipo Nombre_Objeto = new NombreClase]
        rango = listar.crearRango(5, 15);
       
        System.out.print("El array: [");
        for(int i = 0; i < rango.length; i++){
            System.out.print(rango[i]+" ");
        }
        System.out.println("]");
    }
    
}
