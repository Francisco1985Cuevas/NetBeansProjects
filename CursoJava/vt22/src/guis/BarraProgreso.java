//indicamos que este archivo es del paquete guis
package guis;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase BarraProgreso y la hacemos subclase de JFrame
public class BarraProgreso extends JFrame {

    JProgressBar actual;    
    int num = 0;

    public BarraProgreso() {
        //llamamos al Constructor() de la superclase JFrame, lo
        //hacemos mediante el uso de super()
        //configurar el titulo del marco
        super("Barra de Progreso");
        
        //definir cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //configurar el tamanho del marco
        setSize(205, 68);
        
        //asignamos al marco el gestor de disenho
        setLayout(new FlowLayout());
        
        //creamos el componente JProgressBar
        //creamos la barra de progreso
        actual = new JProgressBar(0, 2000);
        actual.setValue(0);
        
        //hace que se muestre el numero que se va cargando
        actual.setStringPainted(true);
        
        //anhadimos el componente al marco
        add(actual);
    }


    public void iterate() {
        while (num < 2000) {
            actual.setValue(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            num += 95;
        }
    }

    public static void main(String[] arguments) {
        BarraProgreso marco = new BarraProgreso();
        
        //hacemos visible el marco
        marco.setVisible(true);
        
        marco.iterate();
   }
}
