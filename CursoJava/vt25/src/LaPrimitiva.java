import java.awt.*;
import javax.swing.*;

public class LaPrimitiva extends JFrame {
    
    LaPrimitivaEventos primi = new LaPrimitivaEventos(this);
    
    // configurar fila 1
    JPanel fila1 = new JPanel();
    ButtonGroup opcion = new ButtonGroup();
    JCheckBox automatico = new JCheckBox("Automático", false);
    JCheckBox manual = new JCheckBox("Manual", true);
    // configurar fila 2
    JPanel fila2 = new JPanel();
    JLabel etiquetaNumeros = new JLabel("Tus Elecciones: ", JLabel.RIGHT);
    JTextField[] numeros = new JTextField[6];
    JLabel etiquetaGanadores = new JLabel("Ganadores: ", JLabel.RIGHT);
    JTextField[] ganadores = new JTextField[6];
    // configurar fila 3
    JPanel fila3 = new JPanel();
    JButton parar = new JButton("Parar");
    JButton jugar = new JButton("Jugar");
    JButton reiniciar = new JButton("Reiniciar");
    // configurar fila 4
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

    public LaPrimitiva() {
        super("Lotería Primitiva");
        setSize(750, 270);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);

        // Add listeners
        automatico.addItemListener(primi);
        manual.addItemListener(primi);
        parar.addActionListener(primi);
        jugar.addActionListener(primi);
        reiniciar.addActionListener(primi);

        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER,
        10, 10);
        opcion.add(automatico);
        opcion.add(manual);
        fila1.setLayout(layout1);
        fila1.add(automatico);
        fila1.add(manual);
        add(fila1);

        GridLayout layout2 = new GridLayout(2, 7, 10, 10);
        fila2.setLayout(layout2);
        fila2.add(etiquetaNumeros);
        for (int i = 0; i < 6; i++) {
            numeros[i] = new JTextField();
            fila2.add(numeros[i]);
        }
        fila2.add(etiquetaGanadores);
        for (int i = 0; i < 6; i++) {
            ganadores[i] = new JTextField();
            ganadores[i].setEditable(false);
            fila2.add(ganadores[i]);
        }
        add(fila2);

        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER,
            10, 10);
        fila3.setLayout(layout3);
        parar.setEnabled(false);
        fila3.add(parar);
        fila3.add(jugar);
        fila3.add(reiniciar);
        add(fila3);

        GridLayout layout4 = new GridLayout(2, 3, 20, 10);
        fila4.setLayout(layout4);
        fila4.add(etiquetaObtener3);
        obtener3.setEditable(false);
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
        add(fila4);

        setVisible(true);
    }

    public static void main(String[] arguments) {
        LaPrimitiva marco = new LaPrimitiva();
    }
}
