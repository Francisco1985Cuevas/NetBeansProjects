//forma parte de un paquete llamado eventos
package eventos;

//importamos los paquetes que necesitamos
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase MainClass
public class MainClass {
    
    public static void main(String[] args) {
        //creamos tres radio botones y les pasamos un 
        //valor mediante setActionCommand
        JRadioButton pp = new JRadioButton("Roberto", false);
        pp.setActionCommand("Roberto");
        
        JRadioButton psoe = new JRadioButton("Jaime", false);
        psoe.setActionCommand("Jaime");
        
        JRadioButton iu = new JRadioButton("Rosa", false);
        iu.setActionCommand("Rosa");
        
        // Convertimos los radio botones en un grupo
        final ButtonGroup grupo = new ButtonGroup();
        grupo.add(pp);
        grupo.add(psoe);
        grupo.add(iu);
    
        
        //creamos la clase VotoActionListener que implementa 
        //la interface ActionListener
        class VotoActionListener implements ActionListener {
            public void actionPerformed(ActionEvent ex) {
                String eleccion = grupo.getSelection().getActionCommand(); //recuperamos valor de ActionCommand con getActionCommand()
                System.out.println("Acción Candidato Seleccionado: " + eleccion); //imprimimos valor recuperado
            }
        }
        
        //creamos clase VotoItemListener que implementa la
        //interface ItemListener
        class VotoItemListener implements ItemListener {
            public void itemStateChanged(ItemEvent ex) {
                String item = ((AbstractButton) ex.getItemSelectable()).getActionCommand();//recuperamos valor de ActionCommand con getActionCommand()
                boolean selected = (ex.getStateChange() == ItemEvent.SELECTED);
                System.out.println("ITEM Candidato Seleccionado: " + selected + " Selección: " + item);//imprimimos valor recuperado
            }
        }
        
        //creamos objeto de la clase VotoActionListener()
        ActionListener al = new VotoActionListener();
        pp.addActionListener(al); //Añadimos ActionListener a pp
        psoe.addActionListener(al); //Añadimos ActionLister a psoe
        iu.addActionListener(al); //Añadimos ActionListerner a iu
        //creamos objeto de la clase VotoItemListener
        ItemListener il = new VotoItemListener();
        pp.addItemListener(il); //Añadimos ItemListener a pp
        psoe.addItemListener(il); //Añadimos ItemListener a psoe
        iu.addItemListener(il); //Añadimos ItemListener a iu
        
        //creamos el marco, le aplicamos un gestor de diseño y añadimos radio botones
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = frame.getContentPane();
        c.setLayout(new GridLayout(4, 1));
        c.add(new JLabel("Emite tu voto, por favor."));
        c.add(pp);
        c.add(psoe);
        c.add(iu);
        frame.pack();
        frame.setVisible(true);
    }
}
