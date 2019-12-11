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
    }
    
    public static void main(String[] args){
        // se crea el objeto
        MarcoPrincipal miMarco = new MarcoPrincipal(); 
    }    
}
*/

import javax.swing.*;

public class CursoVideotutoriales extends JFrame{
    public CursoVideotutoriales(){
        super("Curso Videotutoriales Java");
        
        //configurar el tamaño
        setSize(350, 100); 
        //configurar el boton
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //para que aparezca el marco
        setVisible(true); 
        
        //ahora que ya tenemos nuestro marco, podemos
        //anhadirle componentes.
        //para anhadir componentes lo que tenemos que
        //hacer es crear el componente, para cada componente 
        //contamos con una clase dentro del paquete Swing
        //despues de crear el componente tenemos que anhadirlo
        //al contenedor, cada contenedor tiene un metodo que es
        //el metodo add() que toma como argumento el componente
        //que queremos que se muestre, que se le añada a nuestro
        //marco
        
        //Un Objeto JButton es un boton pulsable con una etiqueta.
        //JButton es parte del paquete Swing
        
        //añadimos un componente(un Boton)
        //crear componente
        JButton botonAceptar = new JButton("Aceptar");
        //añadir dentro del contenedor(marco), add() metodo del
        //contenedor
        add(botonAceptar);
    }
    
    public static void main(String[] args){
        CursoVideotutoriales curso = new CursoVideotutoriales(); // se crea el objeto
    } 
}
