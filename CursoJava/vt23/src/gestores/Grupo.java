package gestores;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grupo extends JFrame{
    //creamos una serie de botones, que son los componentes
    //que vamos a utilizar
    JButton manuel = new JButton("Manuel");
    
    public Grupo() {
        
        //Crea una nueva ventana a la que se le pone por título la cadena de texto que se le indique.
        super("Grupo"); //llamamos al constructor de la superclase
        
        //setSize(750, 250); //configuramos el tamanho del JFrame()
        setSize(260, 260); //configuramos el tamanho del JFrame()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Especifica la operación por defecto al cerrar el JFrame
        
        //creamos un panel
        JPanel panel = new JPanel();
        
        //creamos un objeto del gestor de diseño
        GridLayout miembros = new GridLayout(3, 3, 10, 10);//parrilla(3 filas, 3 columnas, separacionentrecomponentesHorizonal 10, separacionentrecomponentesVertical 10)
        
        //le aplicamos ese gestor de diseño al panel
        panel.setLayout(miembros);
        
        //anhadimos los componentes
        panel.add(manuel); //agrega el boton manuel
        
        //
        add(panel);
        setVisible(true);
    }
    
    public static void main(String [] args){
        Grupo marco = new Grupo();
    }
    
}
/*
-------
public class Grupo extends JFrame {
    JButton manuel = new JButton("Manuel");
    JButton carla = new JButton("Carla");
    JButton gregorio = new JButton("Gregorio");
    JButton juan = new JButton("Juan");
    JButton alberto = new JButton("Alberto");
    JButton pedro = new JButton("Peter");
    JButton cecilia = new JButton("Cecilia");
    JButton miguel = new JButton("Miguel");
    JButton roberto = new JButton("Roberto");

    public Grupo() {
        panel.add(carla);
        panel.add(gregorio);
        panel.add(juan);
        panel.add(alberto);
        panel.add(pedro);
        panel.add(cecilia);
        panel.add(miguel);
        panel.add(roberto);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        Grupo marco = new Grupo();
    }
}
*/
