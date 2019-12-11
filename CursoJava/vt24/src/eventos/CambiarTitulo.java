//indicamos que este archivo pertenece al paquete eventos
package eventos;

//importamos los paquetes que necesitamos
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//creamos la clase CambiarTitulo y la hacemos subclase de JFrame e implementa a ActionListener
public class CambiarTitulo extends JFrame implements ActionListener { //1) implementar la interface ActionListener
    
    //se crean dos componentes botones
    JButton b1 = new JButton("Curso de JavaScript");
    JButton b2 = new JButton("Curso de PHP");
    
    //Para empezar vamos a tener que llamar al
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public CambiarTitulo() {
        
        //Configurar titulo del marco
        super("Barra de Titulo");
        
        //Definir cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //2)metodo le indica el componente a vigilar(aqui son dos componentes)
        //anhadimos los metodos listeners addActionListener()
        //a cada uno de los botones pasandole como argumento
        //this para indicar que es el propio boton, el propio
        //objeto el que tiene que ser vigilado.
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        //crear un gestor de disenho
        FlowLayout flow = new FlowLayout();
        //hacemos que ese gestor de disenho se aplique al marco
        setLayout(flow);
        
        //anhadimos los componentes al marco
        add(b1);
        add(b2);
        
        pack();
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    //3) se implementan los metodos de la interface(aqui solo uno)
    public void actionPerformed(ActionEvent evt) {
        Object fuente = evt.getSource(); //4)el metodo nos devuelve un objeto event, que podemos usar para detectar el componente que lo ha producido.
        if (fuente == b1) {
            setTitle("Curso de JavaScript");
        } else if (fuente == b2) { //5)usamos el operador == para comparar. prodriamos usar instanceOf para tipos de componentes.
            setTitle("Curso de PHP");
        }
        repaint();
    }

    public static void main(String[] arguments) {
        CambiarTitulo marco = new CambiarTitulo();
    }
}
