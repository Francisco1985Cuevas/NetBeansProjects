//indicamos que este archivo pertenece al paquete guis
package guis;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase OtraBarra y la hacemos subclase de JFrame
public class OtraBarra extends JFrame {
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public OtraBarra() {
        
        //2-) Configurar titulo
        super("Barra de Herramientas");
        
        //4-) Definir cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear componentes
        
        //pasos para crear la barra de herramientas
        // 1)creamos las imagenes que vamos a usar en la aplicacion
        ImageIcon iconoCargar = new ImageIcon("cargar.png");
        ImageIcon iconoSalvar = new ImageIcon("salvar.png");
        ImageIcon iconoSubscribir = new ImageIcon("alta.png");
        ImageIcon iconoBaja = new ImageIcon("baja.png");
        
        //2)creamos los botones a los que le anhadiremos
        //las imagenes
        JButton cargar = new JButton("Cargar", iconoCargar);
        JButton salvar = new JButton("Salvar", iconoSalvar);
        JButton subscribir = new JButton("Alta", iconoSubscribir);
        JButton baja = new JButton("Baja", iconoBaja);
        
        //creamos la barra de herramientas
        JToolBar barra = new JToolBar();
        
        // Añadir botones a la barra de herramientas
        barra.add(cargar);
        barra.add(salvar);
        barra.add(subscribir);
        barra.add(baja);
        
        //anhadimos otro componente mas el JTextArea
        JTextArea editar = new JTextArea(8, 40);
        //hacemos que sea scrollable
        JScrollPane scroll = new JScrollPane(editar);
        
        
        // preparar interface usuario
        //gestor de diseño
        BorderLayout borde = new BorderLayout();
        
        //configuramos el gestor de disenho para esta interface
        setLayout(borde);
        
        
        //anhadir componentes al marco
        add("North", barra);
        add("Center", scroll);
        
        //sea amoldable el tamanho de la interface a los componentes que ya tiene
        pack();
        
        //hacemos que el marco sea visible
        setVisible(true);
    }

    public static void main(String[] arguments) {
       
        OtraBarra frame = new OtraBarra();
    }
}
