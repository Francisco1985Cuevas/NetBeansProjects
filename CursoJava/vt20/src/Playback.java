/*
//Para hacer el paquete de clases Swing disponible en 
//un programa Java usamos la declaración “import”.
import javax.swing.*;

public class MarcoPrincipal extends JFrame{
    
    //1-) Para empezar vamos a tener que llamar a un 
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    //Super() se utiliza en una subclase para poder 
    //acceder a  los constructor(), a los metodos que 
    //se encuentran en su superclase.
    public MarcoPrincipal(){
        //2-) Configurar titulo, super(“Mi titulo”) Agrega 
        //el titulo en nuestro marco
        super("Mi Titulo");
        
        //3-) Configurar tamaño del marco, 
        //setSize(400 Ancho, 200 Alto) ; pack();
        setSize(400, 200); //Alto, Ancho en pixeles
        
        //4-) Definir cierre, .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//configurar el boton
        
        //5-) Hacer nuestro marco visible, llamar al metodo setVisible(true);
        setVisible(true); //para que aparezca el marco

        //6-)Utilizar un gestor de diseño para distribuir los 
        //componentes dentro del marco
        FlowLayout dis = new FlowLayout();
        //configuramos para que sea el que se utilice dentro del marco
        setLayout(dis);
        
        //creamos un componente
        JButton play = new JButton("Play");
        
        //ponemos dentro del marco
        add(play);
   
        setVisible(true);
    }
    
    public static void main(String[] args){
        // se crea el objeto
        MarcoPrincipal miMarco = new MarcoPrincipal(); 
    }    
}
*/

import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame{ //extiende a JFrame
    
    //creamos el marco y agregamos componentes dentro del marco
    public Playback(){
        super("Playback"); //Agrega el titulo
        
        setSize(225, 80); //configuramos el tamaño
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); //aparezca el marco, sea visible
        
        //segundo paso:utilizar un gestor de diseño para distribuir los componentes dentro del marco
        //parte del gestor de diseño
        FlowLayout dis = new FlowLayout();
        setLayout(dis); //configuramos para que sea el que se utilice dentro del marco
        
        //crear los botones
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pausa = new JButton("Pausa");
        //ponerlos dentro del marco
        add(play);
        add(stop);
        add(pausa);
        setVisible(true);//ahora para los botones
    }
    
    //creamos el metodo main que nos permite ejecutar este programa
    public static void main(String[] arguments){
        Playback pb = new Playback(); //cuando se crea el objeto ya se ejecuta el constructor
    }
    
}