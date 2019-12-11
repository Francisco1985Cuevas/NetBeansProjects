//indicamos que este archivo ActionCommand.java pertene al paquete eventos
package eventos;

//importamos los paquetes que necesitamos
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//creamos la clase ActionCommand y la hacemos subclase de JFrame e implementamos la interface ActionListener
public class ActionCommand extends JFrame implements ActionListener {//1) implementar la interface en este caso solo una: ActionListener
    
    //se crea un componente boton
    JButton b1 = new JButton("Curso de JavaScript");
    
    public ActionCommand() {
        //llamamos al Constructor() de la superclase JFrame, mediante
        //el uso de super()
        //configuramos el titulo del marco
        super("Barra de Titulo");
        
        //indicamos el comportamiento del cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //2)anhadimos un listener al componente
        //el metodo addActionListener(this) indica el componente
        //a vigilar, en este caso se indica el boton con el uso de 
        //la palabra reservada "this"
        b1.addActionListener(this);
        
        //instanciamos el gestor de disenho FlowLayout
        FlowLayout flow = new FlowLayout();
        //hacemos que ese gestor de disenho se aplique al marco
        setLayout(flow);
        
        //anhadimos el componente boton al marco
        add(b1);
        
        //configurar tamanho automatico del marco
        pack();
        
        //hacemos visible el marco
        setVisible(true);
    }

    //3) se implementan los metodos de la interface(aqui solo uno actionPerformed)
    public void actionPerformed(ActionEvent evt) {
        //al pulsar el boton se ejecuta actionPerformed
        b1.setActionCommand("prueba");//
        b1.setLabel(b1.getActionCommand());//        
        repaint();//ver inmediatamente el resultado
    }

    public static void main(String[] arguments) {
        ActionCommand marco = new ActionCommand();
    }
}
