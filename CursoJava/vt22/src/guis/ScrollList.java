//este archivo pertenece al paquete guis
package guis;

//importamos los paquetes que vamos a utilizar
import javax. swing.*;
import java. awt.*;

//creamos la clase ScrollList y la hacemos subclase de JFrame
public class ScrollList extends JFrame {
    
    //scrollpane sera el objeto donde posteriormente almacenaremos el scroll
    JScrollPane scrollpane;
    
    //1-) Para empezar vamos a tener que llamar al
    //Constructor() de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public ScrollList() {
        
        //2-) Configurar titulo
        super("Ejemplo de JScrollPane");
        
        //3-) Configurar tamaño del marco
        setSize(300, 200);
        
        //se crea un componente JList
        String categorias[] = {"Curso de PHP", "Curso de JAVA", "Curso de Camtasia"};//elementos que forman la lista
        JList lista = new JList(categorias);
        
        //add(lista);
        //lista.setVisible(true);
        
        //crear el objeto Scroll y indicarle el componente al que
        //queremmos aplicarle el scroll en este caso el componente
        //es lista
        scrollpane = new JScrollPane(lista);
        
        //le aplicamos el gestor de diseño BorderLayout
        getContentPane().add(scrollpane, BorderLayout.CENTER);
    }
    
    public static void main(String[] arguments) {
        ScrollList sl = new ScrollList();
        sl.setVisible(true);
    }
}
