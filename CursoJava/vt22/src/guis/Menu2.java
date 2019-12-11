//indicamos que este archivo pertenece al paquete guis
package guis;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase Menu2 y la hacemos subclase de JFrame
public class Menu2 extends JFrame {
    
    //llamamos al Constructor() de la superclase JFrame, lo
    //hacemos mediante el uso de super()
    public Menu2() {
        
        //configuramos el titulo del marco
        super("Ejemplo Menú");
        
        //definimos el cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos componentes para el marco
        // crear iconos
        ImageIcon iconoCargar = new ImageIcon("cargar.png");
        ImageIcon iconoSalvar = new ImageIcon("salvar.png");
        ImageIcon iconoSubscribir = new ImageIcon("alta.png");
        ImageIcon iconoBaja = new ImageIcon("baja.png");
        // crear botones
        JButton cargar = new JButton("Cargar", iconoCargar);
        JButton salvar = new JButton("Salvar", iconoSalvar);
        JButton subscribir = new JButton("Alta", iconoSubscribir);
        JButton baja = new JButton("Baja", iconoBaja);
        // Añadir botones a la barra de herramientas
        JToolBar barra = new JToolBar();
        barra.add(cargar);
        barra.add(salvar);
        barra.add(subscribir);
        barra.add(baja);
        // crear menu
        //items del menu
        JMenuItem j1 = new JMenuItem("Abrir");
        JMenuItem j2 = new JMenuItem("Salvar");
        JMenuItem j3 = new JMenuItem("Alta");
        JMenuItem j4 = new JMenuItem("Baja");
        //crear el menu
        JMenu menu = new JMenu("Ejemplo Menú");
        
        //anhadir los items al menu
        menu.add(j1);
        menu.add(j2);
        menu.addSeparator();
        menu.add(j3);
        menu.add(j4);
        
        //incluir el menu dentro de la barra
        JMenuBar menubar = new JMenuBar();
        menubar.add(menu);


        // preparar interface usuario
        
        JTextArea editar = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(editar);
        BorderLayout borde = new BorderLayout();
        
        //asignamos al marco el gestor de disenho en este caso BorderLayout
        setLayout(borde);
        
        //anhadimos los componentes al marco
        add("North", barra);
        add("Center", scroll);
        
        setJMenuBar(menubar);
        
        pack();
        
        //hacemos visible el marco
        setVisible(true);
    }

    public static void main(String[] arguments) {
        Menu2 frame = new Menu2();
    }
}
