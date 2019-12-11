//indicamos el paquete al que pertenece este archivo
package guis;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase BarraHerramientas y la hacemos subclase de JFrame
public class BarraHerramientas extends JFrame {
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public BarraHerramientas() {
        
        //2-) Configurar titulo del marco
        super("Barra de Herramientas");
        
        //3-) Configurar tamaño del marco
        setSize(370, 200);
        
        //4-) Definir cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //crear componentes
        // construir botones barra herramientas
        ImageIcon imagen1 = new ImageIcon("cargar.png");
        JButton boton1 = new JButton(imagen1);
        ImageIcon imagen2 = new ImageIcon("salvar.png");
        JButton boton2 = new JButton(imagen2);
        ImageIcon imagen3 = new ImageIcon("alta.png");
        JButton boton3 = new JButton(imagen3);
        ImageIcon imagen4 = new ImageIcon("baja.png");
        JButton boton4 = new JButton(imagen4);
        // construir barra herramientas
        JToolBar barra = new JToolBar();
        barra.add(boton1);
        barra.add(boton2);
        barra.add(boton3);
        barra.add(boton4);

        // construir area texto
        JTextArea editar = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(editar);
        
        //gestor de disenho
        // construir marco
        BorderLayout borde = new BorderLayout();
        setLayout(borde);
        
        //agregar los componentes al marco
        add("North", barra);
        add("Center", scroll);
        
        //hacemos visible el marco
        setVisible(true);
    }

    public static void main(String[] arguments) {
        BarraHerramientas herramientas = new BarraHerramientas();
    }
}

