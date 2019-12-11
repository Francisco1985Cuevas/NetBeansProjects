//incluimos la clase en el paquete eventos
package eventos;

//importamos los paquetes necesarios
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

//creamos la clase Calculadora subclase de JFrame e implementa 
//la herencia FocusListener
public class Calculadora extends JFrame implements FocusListener {
    
    //Creamos los campos de texto y las etiquetas para 
    //la calculadora
    JTextField valor1 = new JTextField("0", 5);
    JLabel mas = new JLabel("+");
    JTextField valor2 = new JTextField("0", 5);
    JLabel igual = new JLabel("=");
    JTextField suma = new JTextField("0", 5);
    
    //Creamos el Constructor
    public Calculadora() {
        //Llamamos al Constructor de la Superclase(JFrame)
        super("Añade dos números");
        
        //Le damos un tamaño al marco
        setSize(350, 90);
        
        //comportamiento botón cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos un objeto gestor de diseño FlowLayout
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER); 
        //aplicamos el gestor de diseño
        setLayout(flow);
        
        //añadimos listeners a los dos campos de entrada de texto
        valor1.addFocusListener(this);
        valor2.addFocusListener(this);
        
        // configuramos campo suma y lo hacemos no editable
        suma.setEditable(false);
        
        // añadimos los Componentes al marco
        add(valor1);
        add(mas);
        add(valor2);
        add(igual);
        add(suma);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    //implementamos el método focusGained de la 
    //interface FocusListener
    public void focusGained(FocusEvent event) {
        try {
            //Convertimos valores campos de String a números 
            //y los sumamos
            float total = Float.parseFloat(valor1.getText()) +
            Float.parseFloat(valor2.getText());
            
            //Añadimos el resultado al campo suma
            suma.setText("" + total);
        } catch (NumberFormatException nfe) {
            //Añadimos excepción si valores texto no pueden 
            //convertirse a número
            valor1.setText("0");
            valor2.setText("0");
            suma.setText("0");
        }
    }
    
    //Hacemos que el método focusLost haga lo mismo 
    //llamando al método focusGained.
    public void focusLost(FocusEvent event) {
        focusGained(event);
    }
    
    
    //creamos el método main
    public static void main(String[] arguments) {
        //creamos objeto de la clase calculadora.
        Calculadora marco = new Calculadora(); 
    }
}
