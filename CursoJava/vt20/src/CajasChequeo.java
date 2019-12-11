//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.*;

public class CajasChequeo extends JFrame{
    public CajasChequeo(){
        //llamamos al constructor() de la superclase JFrame
        super("Cajas Chequeo");
        
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creamos las cajas de checkeo(Componentes)
        JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash", true);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
        
        // Usamos FlowLayout para darle un diseño a la interface
        FlowLayout dis = new FlowLayout();
        
        // Usamos ButtonGroup para hacer que estas cajas de checkeo 
        //formen parte de un grupo
        //se crea otro componente y se asocian a los botones
        ButtonGroup cursos = new ButtonGroup();
        //Anhadimos los botones al ButtonGroup
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        
        //Para que se aplique el gestor de diseño a este marco
        setLayout(dis);
        
        //anhadimos los componentes al marco
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    public static void main(String[] arguments){
        CajasChequeo app = new CajasChequeo();
    }
}
