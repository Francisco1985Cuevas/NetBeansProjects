//importamos los paquetes necesarios
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//creamos la clase NumerosPrimos la hacemos subclase de JFrame 
//e implementa las interfaces Runnable, ActionListener
class NumerosPrimos extends JFrame implements Runnable, ActionListener {
    
    Thread ir;//creamos una variable de tipo objeto Thread
    
    //componentes: etiqueta, campo de texto, boton, area de texto
    JLabel etiquetaCuantos = new JLabel("Cantidad: ");
    JTextField cuantos = new JTextField("250", 10);
    JButton mostrar = new JButton("Mostrar Primos");
    JTextArea primos = new JTextArea(8, 40);
    
    
    NumerosPrimos() {
        //Llamamos al Constructor de la Superclase(JFrame)
        super("Mostrar Números Primos");
        
        //Le damos un tamaño al marco
        setSize(400, 300);
        
        //configuramos el comportamiento del botón de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //creamos un objeto gestor de diseño BorderLayout
        BorderLayout borde = new BorderLayout();
        
        //aplicamos el gestor de diseño al marco
        setLayout(borde);
        
        //añadimos listener al boton mostrar
        mostrar.addActionListener(this);//anhadimos vigilante al boton mostrar
        
        //creamos un panel y le anhadimos los componentes
        JPanel topPanel = new JPanel();
        topPanel.add(etiquetaCuantos);
        topPanel.add(cuantos);
        topPanel.add(mostrar);
        
        //anhadimos panel al marco, creamos un objeto gestor 
        //de diseño BorderLayout
        //aplicamos el gestor de diseño al panel
        add(topPanel, BorderLayout.NORTH);
        
        //hacemos scrollable el panel, le aplicamos el gestor
        //de disenho
        //anhadimos el scroll dentro de nuestro marco
        primos.setLineWrap(true);//los numeros se muestren en distintas lineas cuando se alcance el ancho del panel
        JScrollPane panelTexto = new JScrollPane(primos);
        add(panelTexto, BorderLayout.CENTER);
        
        //hacemos visible el marco/contenedor
        setVisible(true);
    }
    
    //este metodo se ejecuta cuando pulsamos el boton mostrar
    public void actionPerformed(ActionEvent event) {
        mostrar.setEnabled(false);
        if (ir == null) { //significa que aun no se ha creado un objeto de la clase Thread
            ir = new Thread(this); //creamos un objeto de la clase Thread
            ir.start(); //llamamos a su metodo start() -> llama a run()
        }
    }
    
    //este metodo se ejecuta cuando se pulse sobre el boton
    public void run() {
        int cantidad = Integer.parseInt(cuantos.getText()); //recoge el numero que se ha escrito en el campo de texto y lo convierte a entero
        int numPrimos = 0;
        // candidato: el número que puede ser primo
        int candidato = 2;
        primos.append("Primeros " + cantidad + " números primos: ");
        while (numPrimos < cantidad) {
            if (esPrimo(candidato)) {
                primos.append(candidato + " ");
                numPrimos++;
            }
            candidato++;
        }
    }
    
    //compara el numero que se le pasa para ver si es divisible
    //con algun resto.
    public static boolean esPrimo(int comprobarNumero) {
        double raiz = Math.sqrt(comprobarNumero);
        for (int i = 2; i <= raiz; i++) {
            if (comprobarNumero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //metodo main, para que se ejecute el constructor()
    public static void main(String[] arguments) {
        NumerosPrimos np = new NumerosPrimos();
    }
}
