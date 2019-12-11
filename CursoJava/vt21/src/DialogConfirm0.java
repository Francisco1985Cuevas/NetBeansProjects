//importamos el paquete que necesitamos
import javax.swing.*;

public class DialogConfirm0 extends JFrame{

    public DialogConfirm0() {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres borrar este archivo?");
    }
    
   
   public static void main(String [] args){
       DialogConfirm0 dialog = new DialogConfirm0();
   } 
    
}