package guis;
import javax. swing.*;
import java. awt.*;

public class AreaTexto extends JFrame {
    //JScrollPane scrollpane;
    public AreaTexto() {
        super("AreaTexto");
        setSize(500, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentarios = new JTextArea(8, 40);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        add(comentarios);
        setVisible(true);
        //scrollpane = new JScrollPane(comentarios);
        //getContentPane().add(scrollpane, BorderLayout.CENTER);
        
    }

    public static void main(String[] arguments) {        
        AreaTexto app = new AreaTexto();
    }
}