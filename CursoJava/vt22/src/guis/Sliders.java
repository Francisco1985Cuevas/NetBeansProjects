//indicamos que este archivo pertenece al paquete guis
package guis;

//importamos los paquetes que vamos a necesitar
import java.awt.event.*;
import javax.swing.*;

//creamos la clase Sliders y la hacemos subclase de JFrame
public class Sliders extends JFrame{
    
    //1-) Para empezar vamos a tener que llamar al
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    //Super() se utiliza en una subclase para poder 
    //acceder al Constructor(), a los metodos que 
    //se encuentran en su superclase.
    public Sliders() {
        //2-) Configurar titulo
        super("Ejemplo Slider");
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos nuestro objeto jslider(componente)
        JSlider miSlider = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
        //se determinan el espacio y demas del Slider
        miSlider.setMajorTickSpacing(10);
        miSlider.setMinorTickSpacing(1);
        miSlider.setPaintTicks(true);
        miSlider.setPaintLabels(true);
        
        //anhadir el componente al marco
        add(miSlider);
    }
    
    
    public static void main(String[] arguments){
        //creamos el metodo main para poder ejecutar nuestra clase
        Sliders marco = new Sliders();
        
        //permite ordenar el contenido de el marco dependiendo del tamanho que tenga cada uno de los componentes
        marco.pack(); 
        
        //hacemos visible el marco
        marco.setVisible(true);
    }
    
}
