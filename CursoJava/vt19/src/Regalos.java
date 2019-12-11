//esta aplicacion va a usar las clases que vamos a guardar dentro
//de un paquete.
import com.illasaron.paratienda.*;

public class Regalos{
    
    public static void main(String [] arguments){
        Escaparate almacen = new Escaparate();
        almacen.addArticulo("CO1", "ZAPATILLAS", "9.99", "150");
        almacen.addArticulo("CO2", "BOLSA DEPORTIVA", "12.99", "82");
        almacen.addArticulo("CO2", "SUDADERA", "10.49", "800");
        almacen.addArticulo("DO1", "CAMISETA", "16.99", "90");
        
        almacen.sort();
        
        for(int i = 0; i < almacen.getSize(); i++){
            Articulos mostrar = (Articulos) almacen.getArticulos(i);
            
            System.out.println("\nArticulos ID: "+ mostrar.getId()+
                    "\nNombre: "+mostrar.getNombre()+
                    "\nPrecio Detalle: "+mostrar.getDetalle()+" EURO "+
                    "\nCantidad: "+mostrar.getCantidad()
            );
                    
        }
        
    }
    
}