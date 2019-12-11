/*
//Para hacer el paquete de clases Swing disponible en 
//un programa Java usamos la declaración “import”.
import javax.swing.*;

public class MarcoPrincipal extends JFrame{
    
    //1-) Para empezar vamos a tener que llamar a un 
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    
    public MarcoPrincipal(){
        //2-) Configurar titulo, super(“Mi titulo”) 
        super("Mi Titulo");
        
        //3-) Configurar tamaño del marco
        setSize(400, 200); //Alto, Ancho en pixeles
        
        //4-) Definir cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5-) Hacer nuestro marco visible
        setVisible(true);

        //6-)creamos dos componentes
        JLabel etiquetaPagina = new JLabel("Direccion Pagina Web: ", JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aqui", 30);


        //7-)Utilizar un gestor de diseño para distribuir los 
        //componentes dentro del marco
        FlowLayout flo = new FlowLayout(); 
        setLayout(flo);
        
        //8-) Anhadimos al marco y lo hacemos visible
        add(etiquetaPagina); 
        add(direccionPagina);
        setVisible(true);
       
    }
    
    public static void main(String[] args){
        // se crea el objeto
        MarcoPrincipal miMarco = new MarcoPrincipal(); 
    }    
}
*/
//importamos los dos paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JFrame{
    public CampoTexto(){
        
        super("CampoTexto");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos los componentes
        JLabel etiquetaPagina = new JLabel("Direccion Pagina Web: ", JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aqui", 30);
        
        //determinamos el gestor de diseño
        FlowLayout flo = new FlowLayout(); 
        setLayout(flo);
        
        //añadirlos al marco
        add(etiquetaPagina); 
        add(direccionPagina);
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        CampoTexto apli = new CampoTexto();
    }    
}
