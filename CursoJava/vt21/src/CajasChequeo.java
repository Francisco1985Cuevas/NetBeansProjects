//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

//creamos la clase CajasChequeo y lo hacemos subclase de JFrame
public class CajasChequeo extends JFrame{
    
    //en el Constructor(), llamamos con el uso de super()
    //al Constructor() de la superclase JFrame
    public CajasChequeo(){
        
        super("Cajas Chequeo");
        
        try{
            // Aplicandole los aspectos...
            
            UIManager.setLookAndFeel(
                    
                //Muestra el aspecto del sistema operativo
                //UIManager.getSystemLookAndFeelClassName());
                
                //updateComponentTreeUI: indicarle al componente que aplique, que se actualice con este nuevo aspecto 
                //SwingUtilities.updateComponentTreeUI(this); 
                
                //le aplica el aspecto ocean
                //UIManager.getCrossPlatformLookAndFeelClassName());
                //SwingUtilities.updateComponentTreeUI(this);


                // Tambien se le puede pasar directamente el nombre de la clase
                // como parametro...

                //"com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                //SwingUtilities.updateComponentTreeUI(this);
                
                //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                //SwingUtilities.updateComponentTreeUI(this);
                
                //"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                //SwingUtilities.updateComponentTreeUI(this);
            
                "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);    
            //);
        }catch(Exception e){
            System.out.println("No se ha podido configurar el look and feel:"+e.getMessage());
            e.printStackTrace();
        }
        
        //definimos el tamanho del marco
        setSize(345, 120);
        
        //definimos el cierre del marco
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos los componentes
        JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
        
        // Usamos FlowLayout para darle un diseño a la interface
        FlowLayout dis = new FlowLayout();
        
        //creamos un grupo para los componentes JCheckBox
        ButtonGroup cursos = new ButtonGroup();
        
        //anhadimos los checkbox al grupo de botones
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        
        //Para que se aplique el gestor de diseño a este marco
        setLayout(dis);
        
        //anhadimos los checkbox al marco
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    public static void main(String args[]){
        //creamos una instacia de la clase CajasChequeo
        //y se ejecuta el metodo Constructor()
        CajasChequeo app = new CajasChequeo();
    }
}
