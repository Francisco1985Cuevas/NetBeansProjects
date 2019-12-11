package eventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//creamos clase ComprobarTecla subclase de JFrame
public class ComprobarTecla extends JFrame {
    JLabel etiquetaTecla = new JLabel("Pulsa cualquier tecla");

    public ComprobarTecla() {
        super("Pulsa una tecla");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        MonitorearTecla monitor = new MonitorearTecla(this); //creamos objeto de la clase MonitorearTecla,
        setFocusable(true);
        addKeyListener(monitor); //Añadimos Listener
        add(etiquetaTecla);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        new ComprobarTecla();
    }
}
//creamos la clase MonitorearTecla, subclase de KeyAdapter. Sólo implementamos un método de la interface KeyListener.
//implementa la interface a través de su superclase, así que no necesitamos usar implements aquí de nuevo.
class MonitorearTecla extends KeyAdapter {
    ComprobarTecla display;

    MonitorearTecla(ComprobarTecla display) {
        this.display = display;
    }

    public void keyTyped(KeyEvent event) {
        display.etiquetaTecla.setText("" + event.getKeyChar());
        display.repaint();
    }
}