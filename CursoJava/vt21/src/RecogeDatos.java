//importamos los paquetes que necesitamos
import java.awt.GridLayout;
import java.awt.Event.*;
import javax.swing.*;

//creamos la clase RecogeDatos y la hacemos subclase de JFrame
public class RecogeDatos extends JFrame{
    
    //se crean componentes(etiquetas y Campos de texto)
    // variables privadas tipo JLabel para las etiquetas y
    // JTextField para los campos de texto
    private JLabel etiquetaNombre = new JLabel("Nombre: ", SwingConstants.RIGHT);
    private JLabel etiquetaURL = new JLabel("URL: ", SwingConstants.RIGHT);
    private JLabel etiquetaTipo = new JLabel("Tipo: ", SwingConstants.RIGHT);
    
    private JTextField nombre;
    private JTextField url;
    private JTextField tipo;
    
    
    //1-) Para empezar vamos a tener que llamar al
    //constructor de la superclase JFrame, lo hacemos 
    //mediante el uso de super().
    public RecogeDatos(){
        //2-) Configurar titulo
        super("Recogida de información");
        
        //3-) Configurar tamaño del marco
        setSize(400, 105);
        
        //4-) Definimos el comportamiento que tiene que tener el boton cerrar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //llamamos a setLookAndFeel, antes de crear los componentes
        //a los que va a aplicarsele el aspecto.
        setLookAndFeel(); 
        
        //escribimos las cajas de dialogo donde vamos a ir
        //recogiendo la informacion
        String respuesta1 = JOptionPane.showInputDialog(null, "Escribe el nombre del sitio:");
        nombre = new JTextField(respuesta1, 20); //se le da un ancho de 20 caracteres
        
        String respuesta2 = JOptionPane.showInputDialog(null, "Escribe la direccion del sitio:");
        url = new JTextField(respuesta2, 20);
        
        String[] opciones = {"Personal", "Empresarial", "Gubernamental"};
        int respuesta3 = JOptionPane.showOptionDialog(null, 
                                                        "¿Que tipo de sitio es?", 
                                                        "Tipo Sitio",
                                                        0,
                                                        JOptionPane.QUESTION_MESSAGE,
                                                        null,
                                                        opciones,
                                                        opciones[0]);
        tipo = new JTextField(opciones[respuesta3], 20);
        
        //GridLayout es un gestor de diseño, aplicar el gestor de diseño
        //GridLayout: es un gestor de diseño que nos permite organizar la interface en filas y columnas
        setLayout(new GridLayout(3, 2)); //muestra la info en 3 filas 2 columnas
        
        //anhadir los componentes al marco
        add(etiquetaNombre);
        add(nombre);
        add(etiquetaURL);
        add(url);
        add(etiquetaTipo);
        add(tipo);
        
        setLookAndFeel();
        
        //para que los componentes sean visibles en la interface
        setVisible(true);        
    }
    
    
    private void setLookAndFeel(){
        //metodo privado, aplica un estilo(la piel)
        //a los componentes
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        }catch(Exception e){
            System.err.println("No se ha podido usar el sistema "+"look and feel: "+e);
        }
    }
    
    
    public static void main(String[] arguments){
        RecogeDatos frame = new RecogeDatos();
    }
}
