import javax.swing.*;

public class DialogConfirm{

    public DialogConfirm() {
        int respuesta = JOptionPane.showConfirmDialog(null, 
                "Error leyendo archivo. ¿Quieres probar de nuevo?",
                "Error de archivo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String [] args){
        DialogConfirm dialog = new DialogConfirm();
    }
    
}