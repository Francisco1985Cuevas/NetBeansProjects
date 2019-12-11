//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

public class AreaTexto extends JFrame{
    //1-) Para empezar vamos a tener que llamar a un 
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public AreaTexto(){
        //2-) Configurar titulo
        super("AreaTexto");
        
        //3-) Configurar tamaño del marco
        setSize(500, 180);
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos el componente que va a ir al marco
        JTextArea comentarios = new JTextArea(8, 40);
        
        // Usamos FlowLayout para darle un diseño a la interface
        FlowLayout dis = new FlowLayout();
        //Para que se aplique el gestor de diseño a este marco
        setLayout(dis);
        
        //añadimos el componente curso al marco
        add(comentarios);
        
        //hacemos visible el marco
        setVisible(true);
    }

    public static void main(String[] arguments){
        AreaTexto app = new AreaTexto();
    }
}