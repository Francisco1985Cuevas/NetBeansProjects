//
package guis;

//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

//creamos la clase PanelPestañas y la hacemos subclase de JPanel
public class PanelPestañas extends JPanel {
    
    //llamamos al Constructor() de la superclase JPanel, lo
    //hacemos mediante el uso de super()
    public PanelPestañas() {
        super();
        
        //componentes(items) del panel.
        //creamos los paneles que despues haremos que aprezcan
        //cuando se pulse sobre las pestañas
        JPanel principal = new JPanel();        
        JLabel label1 = new JLabel("Este es el panel Principal");
        principal.add(label1);
        JPanel avanzada = new JPanel();
        JLabel label2 = new JLabel("Este es el panel Avanzada");
        avanzada.add(label2);
        JPanel privada = new JPanel();
        JLabel label3 = new JLabel("Este es el panel Privada");
        privada.add(label3);
        JPanel email = new JPanel();
        JLabel label4 = new JLabel("Este es el panel email");
        email.add(label4);
        JPanel seguridad = new JPanel();
        JLabel label5 = new JLabel("Este es el panel seguridad");
        seguridad.add(label5);
        
        JTabbedPane pestañas = new JTabbedPane();
        ImageIcon icon = new ImageIcon("middle.gif");
        
        principal.setPreferredSize(new Dimension(410, 50));//ancho
        
        pestañas.addTab("Principal",icon, principal);
        pestañas.addTab("Avanzada",icon, avanzada);
        pestañas.addTab("Privada",icon, privada);
        pestañas.addTab("E-mail",icon, email);
        pestañas.addTab("Seguridad",icon, seguridad);

       //Añadimos el componente JTabbedPane dentro del contenedor
        add(pestañas);

        //Habilitamos el uso del scroll de pestañas
        pestañas.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    

    //Crear la GUI y mostrarla.
    private static void crearYMostrarGUI(){
        //Crear y configurar la ventana(marco).
        JFrame marco = new JFrame("Ejemplo Paneles con Pestañas");
        
        //definir el cierre del marco
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Añadir contenido(componentes) a la ventana(marco)
        //configurar el gestor de disenho para el marco
        marco.add(new PanelPestañas(), BorderLayout.CENTER);

        //Mostrar la ventana.
        marco.pack();
        //hacemos visible la ventana/marco
        marco.setVisible(true);
    }

    public static void main(String[] args) {
        crearYMostrarGUI();
    }

}
