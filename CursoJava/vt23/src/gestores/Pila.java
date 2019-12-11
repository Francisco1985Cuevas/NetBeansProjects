//indicamos que este archivo pertene al paquete gestores
package gestores;

//importamos los paquetes que necesitamos
import java.awt.*;
import javax.swing.*;

//creamos la clase Pila y la hacemos subclase de JFrame
public class Pila extends JFrame{
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public Pila() {//Constructor() del marco
        
        //2-) Configurar titulo del marco
        super("Pila");
        
        //configuramos tamanho del marco
        setSize(430, 150);
        
        //4-) indicamos el comportamiento por defecto del boton cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear componentes
        
        //1)crear Panel superior
        JPanel panelComando = new JPanel(); //el contenedor
        //2)crear un gestor de disenho
        BoxLayout horizontal = new BoxLayout(panelComando, BoxLayout.X_AXIS);
        //3)hacemos que ese gestor de disenho se aplique al panel
        panelComando.setLayout(horizontal);
        
        //crear y anhadir componentes al Panel
        JButton alta = new JButton("Alta");
        JButton baja = new JButton("Baja");
        JButton actualizar = new JButton("Actualizar");
        JButton salvar = new JButton("Salvar");
        panelComando.add(alta);
        panelComando.add(baja);
        panelComando.add(actualizar);
        panelComando.add(salvar);
        
        
        //crear panel inferior
        JPanel panelTexto = new JPanel();
        JTextArea texto = new JTextArea(4, 70);
        JScrollPane panelScroll = new JScrollPane(texto);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        
        //anhadir los dos paneles al marco
        //ponerlos juntos
        add(panelComando);
        add(panelScroll);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        //creamos un objeto de la clase Pila para que se ejecute el 
        //Constructor()
        Pila pi = new Pila();
        //27
    }
}