//incluimos la clase en el paquete eventos
package eventos;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase AtrapaMouse y la hacemos subclase de JFrame
//implementa ActionListener con dos componentes (JLabel y JButton) 
//y gestor de diseño BorderLayout.
public class AtrapaMouse extends JFrame implements ActionListener {
    
    public AtrapaMouse() {
        //llamamos al Constructor() de la superclase JFrame
        //indicamos el titulo del marco
        super("Mensaje");
        
        //definimos el comportamiento del cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //indicamos el tamanho del marco
        setSize(420, 220);
        
        //creamos un objeto del gestor de disenho BorderLayout()
        BorderLayout borde = new BorderLayout();
        //aplicamos el gestor de disenho al marco
        setLayout(borde);
        
        //crear componente JLabel
        JLabel mensaje = new JLabel("Pulsa Aceptar para cerrar este programa.");
        
        //anhadir componente al marco, se le aplica el gestor de disenho
        add(BorderLayout.NORTH, mensaje);
        
        //creamos panel
        AtrapaPanel atrapa = new AtrapaPanel();
        atrapa.aceptar.addActionListener(this);
        
        //anhadimos el componente panel al marco
        add(BorderLayout.CENTER, atrapa);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent event) {
        System.exit(0);
    }

    
    public static void main(String[] arguments) {
        new AtrapaMouse();
    }
}

//creamos la clase AtrapaPanel subclase de JPanel e implementa interface MouseMotionListener
class AtrapaPanel extends JPanel implements MouseMotionListener {
    //colocamos botón con valores absolutos.
    JButton aceptar = new JButton("Aceptar");
    int botonX, botonY, ratonX, ratonY;
    int ancho, alto;

    AtrapaPanel() {
        //llamamos al Constructor de la superclase JPanel
        super();
        
        //no se le aplica ningun gestor de disenho
        //por defecto sino se le indica nada se le aplica
        //FlowLayout
        //esta sentencia elimina el gestor de disenho por defecto
        setLayout(null);
        
        addMouseMotionListener(this);
        botonX = 110;
        botonY = 110;
        aceptar.setBounds(new Rectangle(botonX, botonY,90, 20));
        
        //anhadimos el  al panel
        add(aceptar);
    }
    
    //implementamos el metodo de la interface MouseMotionListener
    public void mouseMoved(MouseEvent event) {
        ratonX = event.getX();
        ratonY = event.getY();
        ancho = (int)getSize().getWidth();
        alto = (int)getSize().getHeight();
        if (Math.abs((ratonX + 35) - botonX) < 50) {
            botonX = moverBoton(ratonX, botonX, ancho);
            repaint();
        }
        if (Math.abs((ratonY + 10) - botonY) < 50) {
            botonY = moverBoton(ratonY, botonY, alto);
            repaint();
        }
    }
    
    public void mouseDragged(MouseEvent event) {
        // ignorar este evento
        //implementamos este metodo pero sin incluir nada...
    }

    private int moverBoton(int ratonAt, int botonAt, int borde) {
        if (botonAt < ratonAt) {
            botonAt--;
        } else {
            botonAt++;
        }
        if (botonAt > (borde - 20)) {
            botonAt = 10;
        }
        if (botonAt < 0) {
            botonAt = borde - 80;
        }
        return botonAt;
    }

    public void paintComponent(Graphics comp) {
        super.paintComponent(comp);
        aceptar.setBounds(botonX, botonY, 90, 20);
    }
}
