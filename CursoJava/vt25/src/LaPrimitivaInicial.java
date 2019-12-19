//importamos los paquetes que necesitamos
import java.awt.*;
import javax.swing.*;

//creamos la clase LaPrimitivaInicial y la hacemos subclase de JFrame
public class LaPrimitivaInicial extends JFrame{
    
    //creamos los componentes que vamos a necesitar
    //para seguir un orden los iremos creando por las filas
    //en las que los vamos a colocar, las filas que van a estar
    //en nuestro marco
    
    // configurar fila 1
    //en la primera fila empezamos por crear un nuevo objeto JPanel
    //fila1, dentro de esta primera fila vamos a incluir dos cajas
    //de checkeo con un texto, estas dos cajas de checkeo queremos que
    //formen parte de un grupo para que cuando marque una haya que
    //desmarcar la otra.
    JPanel fila1 = new JPanel();
    ButtonGroup opcion = new ButtonGroup();
    //creamos las dos cajas de checkeo
    JCheckBox automatico = new JCheckBox("Automático", false);
    JCheckBox manual = new JCheckBox("Manual", true);//aparece marcada por defecto
    
    
    //configurar fila 2
    //dentro de este panel queremos colocar dos etiquetas y 12
    //campos de texto, crear dos objetos JLabel y dos arrays de 
    //campo de texto cada uno de ellos con 6 elementos.
    JPanel fila2 = new JPanel();
    JLabel etiquetaNumeros = new JLabel("Tus Elecciones: ", JLabel.RIGHT);
    JTextField[] numeros = new JTextField[6];
    JLabel etiquetaGanadores = new JLabel("Ganadores: ", JLabel.RIGHT);
    JTextField[] ganadores = new JTextField[6];
    
    
    //configurar fila 3
    //queremos que aparezcan los tres botones
    JPanel fila3 = new JPanel();
    JButton parar = new JButton("Parar");
    JButton jugar = new JButton("Jugar");
    JButton reiniciar = new JButton("Reiniciar");
    
    
    //configurar fila 4
    JPanel fila4 = new JPanel();
    JLabel etiquetaObtener3 = new JLabel("3 de 6: ", JLabel.RIGHT);
    JTextField obtener3 = new JTextField("0");
    JLabel etiquetaObtener4 = new JLabel("4 de 6: ", JLabel.RIGHT);
    JTextField obtener4 = new JTextField("0");
    JLabel etiquetaObtener5 = new JLabel("5 de 6: ", JLabel.RIGHT);
    JTextField obtener5 = new JTextField("0");
    JLabel etiquetaObtener6 = new JLabel("6 de 6: ", JLabel.RIGHT);
    JTextField obtener6 = new JTextField("0", 10);
    JLabel etiquetaIntentos = new JLabel("Intentos: ", JLabel.RIGHT);
    JTextField intentos = new JTextField("0");
    JLabel etiquetaYears = new JLabel("Años: ", JLabel.RIGHT);
    JTextField years = new JTextField();
    
    
    //metodo constructor()
    public LaPrimitivaInicial() {
        //crear los gestores de disenho y anhadirle a cada uno
        //los distintos componentes que va a tener, lo hacemos
        //dentro del constructor() para que se ejecute cuando se
        //cree un objeto de la clase.
        
        //llamamos al constructor() de la superclase JFrame
        //definimos el titulo del marco/contenedor
        super("Lotería Primitiva");
        //definimos el tamanho del marco
        setSize(750, 270);
        //definimos el comportamiento del boton de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creamos un objeto gestor de diseño GridLayout
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        //aplicamos el gestor de diseño al marco/contenedor GENERAL
        setLayout(layout);
        
        
        
        //crear los gestores de disenho para cada uno
        //de los paneles
        
        //configurar gestor de disenho fila1
        //Pasos: primero anhadir los componentes al 
        //panel, posteriormente anhadir el gestor de disenho 
        //a ese panel y por ultimo el panel al marco.
        
        //creamos el gestor de disenho FlowLayout
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        //ButtonGroup: formar grupo de cajas de checkeo
        opcion.add(automatico);
        opcion.add(manual);
        //aplicamos el gestor de diseño para la fila1
        fila1.setLayout(layout1); //aplica al panel fila1
        //anhadimos los componentes al panel
        fila1.add(automatico);
        fila1.add(manual);
        //anhadir el panel en el marco general
        add(fila1);
        


        //configurar gestor de disenho fila2
        
        //creamos el gestor de disenho GridLayout
        GridLayout layout2 = new GridLayout(2, 7, 10, 10);//2 filas, 7 columnas
        //aplicamos el gestor de diseño al panel para la fila2
        fila2.setLayout(layout2); //aplica al panel fila2
        //anhadimos los componetes(etiquetas, campos de texto)
        fila2.add(etiquetaNumeros);
        for (int i = 0; i < 6; i++) {
            numeros[i] = new JTextField();
            fila2.add(numeros[i]);
        }
        fila2.add(etiquetaGanadores);
        for (int i = 0; i < 6; i++) {
            ganadores[i] = new JTextField();
            ganadores[i].setEditable(false);//
            fila2.add(ganadores[i]);
        }
        //anhadimos el panel al marco
        add(fila2);
        
        
        
        //configurar gestor de disenho fila3
        
        //creamos el gestor de disenho FlowLayout
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        //aplicamos el gestor de diseño al panel para la fila3
        fila3.setLayout(layout3);
        //hacemos que el boton parar aparezca deshabilitado
        parar.setEnabled(false);
        //anhadimos los 3 botones al panel
        fila3.add(parar);
        fila3.add(jugar);
        fila3.add(reiniciar);
        //anhadimos el panel al marco/contenedor
        add(fila3);
        



        //configurar gestor de disenho fila4
        
        //creamos el gestor de disenho GridLayout
        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        //aplicamos el gestor de diseño al panel para la fila4
        fila4.setLayout(layout4);
        //anhadimos componentes al panel
        fila4.add(etiquetaObtener3);
        obtener3.setEditable(false);//hacemos que el campo no sea editable
        fila4.add(obtener3);
        fila4.add(etiquetaObtener4);
        obtener4.setEditable(false);
        fila4.add(obtener4);
        fila4.add(etiquetaObtener5);
        obtener5.setEditable(false);
        fila4.add(obtener5);
        fila4.add(etiquetaObtener6);
        obtener6.setEditable(false);
        fila4.add(obtener6);
        fila4.add(etiquetaIntentos);
        intentos.setEditable(false);
        fila4.add(intentos);
        fila4.add(etiquetaYears);
        years.setEditable(false);
        fila4.add(years);
        
        //anhadimos el panel al marco/contenedor
        add(fila4);
        
        //hacemos visible el marco/contenedor
        setVisible(true);
    }
    
    //metodo main()
    public static void main(String [] arguments){
        LaPrimitivaInicial marco = new LaPrimitivaInicial();
    }
}