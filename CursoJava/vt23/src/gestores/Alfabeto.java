//indicamos el paquete al que pertenece este archivo Java
package gestores;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase Alfabeto y la hacemos subclase de JFrame
public class Alfabeto extends JFrame{
    
    //creamos componentes(botones) que vamos a usar en la interface
    JButton a = new JButton("Abierto");
    JButton b = new JButton("Basado");
    JButton c = new JButton("Cuerpo");
    JButton d = new JButton("Decision");
    JButton e = new JButton("Evidencia");
    JButton f = new JButton("Formacion");
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public Alfabeto() {
        
        //2-) Configurar titulo del marco
        super("Alfabeto");
        
        //3-) Configurar tamaño del marco
        setSize(360, 120);
        
        //4-) indicamos el comportamiento por defecto del boton cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos un objeto del gestor de disenho FLowLayout
        //FlowLayout milayout = new FlowLayout(FlowLayout.LEFT);
        FlowLayout milayout = new FlowLayout(FlowLayout.LEFT, 25, 15);
        
        //aplicamos el gestor de disenho al marco
        setLayout(milayout);
        
        //añadimos los componentes al marco
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        Alfabeto marco = new Alfabeto();
    }
}