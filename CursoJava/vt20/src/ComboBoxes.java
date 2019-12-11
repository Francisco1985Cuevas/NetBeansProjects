//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

public class ComboBoxes extends JFrame{
    //1-) Para empezar vamos a tener que llamar a un 
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public ComboBoxes(){
        
        //2-) Configurar titulo
        super("Combo Boxes");
        
        //3-) Configurar tamaño del marco
        setSize(345, 120);
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos el componente que va a ir al marco
        JComboBox curso = new JComboBox();
        
        // Usamos FlowLayout para darle un diseño a la interface
        FlowLayout dis = new FlowLayout();
        
        // Creamos los items que queremos que aparezca en 
        //esa lista desplegable(componentes)
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
        
        //Para que se aplique el gestor de diseño a este marco
        setLayout(dis);
        
        //añadimos el componente curso al marco
        add(curso);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        ComboBoxes apli = new ComboBoxes();
    }
}
