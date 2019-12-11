//incluimos la clase en el paquete eventos
package eventos;

//importamos los paquetes necesarios
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//creamos la clase ElegirFormato subclase de JFrame e implementa 
//la herencia ItemListener
public class ElegirFormato extends JFrame implements ItemListener {
    //creamos dos array String(formatos, descripciones)
    //creamos String para ComboBox
    String[] formatos = { "(elige formato)", "Atom", "RSS 0.92",
        "RSS 1.0", "RSS 2.0" };
    //creamos String para etiquetas
    String[] descripciones = {
        "Formato de sindicación y weblog Atom",
        "Formato de sindicación RSS 0.92 (Netscape)",
        "RSS 1.0 (RDF)",
        "RSS 2.0 (RSS Selección Aconsejada)"
    };
    //Creamos Combo y Etiqueta(componentes)
    JComboBox cajaFormato = new JComboBox();
    JLabel etiquetaDescripcion = new JLabel("");
    
    //Creamos el Constructor
    public ElegirFormato() {
        //Llamamos al Constructor de la Superclase(JFrame)
        //configuramos el titulo del marco
        super("Formato de Sindicación");
        
        //Le damos un tamaño al marco
        setSize(420, 125);
        
        //comportamiento botón cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos un objeto gestor de diseño BorderLayout
        //aplicamos el gestor de diseño al marco
        setLayout(new BorderLayout());
        
        //añadimos a Combo items del String Formatos
        for (int i = 0; i < formatos.length; i++) {
            cajaFormato.addItem(formatos[i]);
        }
        cajaFormato.addItemListener(this); // Añadimos listener a Combo
        
        //anhadimos componente al marco
        add(BorderLayout.NORTH, cajaFormato); //Añadimos Combo arriba en gestor diseño(al marco)
        add(BorderLayout.CENTER, etiquetaDescripcion);//Añadimos etiqueta a centro en gestor diseño(al marco)
        
        //hacemos visible el marco
        setVisible(true);
    }
    
    // implementamos método itemStateChanged de interface ItemListener
    public void itemStateChanged(ItemEvent event) {
        int eleccion = cajaFormato.getSelectedIndex();//obtenemos index del item seleccionado
        if (eleccion > 0) {
            //muestra en el marco, la descripcion tomada del array descripciones
            etiquetaDescripcion.setText(descripciones[eleccion-1]); //configuramos texto de etiqueta según index del combo.
        }
    }

   

    public static void main(String[] arguments) {
        ElegirFormato fc = new ElegirFormato();
    }
}
