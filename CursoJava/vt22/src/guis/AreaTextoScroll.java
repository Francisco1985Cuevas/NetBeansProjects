//este archivo pertenece al paquete guis
package guis;

//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

//creamos la clase AreaTextoScroll y la hacemos subclase de JFrame
public class AreaTextoScroll extends JFrame {
   
    JScrollPane scrollpane;
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public AreaTextoScroll() {
        
        //2-) Configurar titulo
        super("AreaTextoScroll");
        
        //3-) Configurar tamaño del marco
        setSize(500, 180);
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //se crea un nuevo componente JTextArea
        JTextArea comentarios = new JTextArea(8, 40);
        
        //se crea una instancia del gestor de disenho
        FlowLayout dis = new FlowLayout();
        //se aplica a este marco este disenho(FlowLayout)
        setLayout(dis);
        
        //anhadimos el componente al marco
        add(comentarios);
        
        //hacemos visible el marco
        setVisible(true);
        
        //crear el objeto Scroll y indicarle el componente al que
        //queremmos aplicarle el scroll en este caso el componente
        //es comentarios
        scrollpane = new JScrollPane(comentarios);
        
        //anhadir al panel en el que queremos que aparezca
        //ese scroll
        //BorderLayout: es otro gestor de diseño
        //getContentPane: le aplicamos un metodo de el ScrollPane
        //con este modo anhadimos el scrollPane al marco.
        getContentPane().add(scrollpane, BorderLayout.CENTER);
    }

    public static void main(String[] arguments) {
        //creamos una instancia de la clase para que se ejecute el Constructor()
        AreaTextoScroll app = new AreaTextoScroll();
    }
}
