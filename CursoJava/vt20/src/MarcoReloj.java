//importamos los paquetes que vamos a usar
import java.awt.*;
import javax.swing.*;

public class MarcoReloj extends JFrame{
    
    //1-) Para empezar vamos a tener que llamar al
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public MarcoReloj(){
        
        //2-) Configurar titulo
        super("Reloj");
        
        //3-) Configurar tamaño del marco
        setSize(400, 100);
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Usamos FlowLayout para darle un diseño a la interface
        FlowLayout dis = new FlowLayout();
        //Para que se aplique el gestor de diseño a este marco
        setLayout(dis);
        
        //creamos un componente
        PanelReloj tiempo = new PanelReloj();
        
        //añadimos el componente al marco
        add(tiempo);
        
        //hacemos visible el marco
        setVisible(true); //tenemos el 
    }
    
    public static void main(String[] arguments){
        MarcoReloj reloj = new MarcoReloj();
    }
}
