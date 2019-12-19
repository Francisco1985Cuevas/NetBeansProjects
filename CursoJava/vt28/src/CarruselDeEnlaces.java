import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class CarruselDeEnlaces extends JApplet
implements Runnable, ActionListener {

    String[] tituloPagina = new String[6];
    URL[] enlacePagina = new URL[6];
    Color darColor = new Color(255, 204, 158);
    int actual = 0;
    Thread ejecutor;

    public void init() {
        tituloPagina[0] = "Sitio de inicio de VideoTutoriales";
        enlacePagina[0] = getURL("http://videotutoriales.com");
        tituloPagina[1] = "Illasaron";
        enlacePagina[1] = getURL("http://www.illasaron.com");
        tituloPagina[2] = "Illasaron Descargas";
        enlacePagina[2] = getURL("http://www.illasaron.com/descargas");
        tituloPagina[3] = "Illasaron Online";
        enlacePagina[3] = getURL("http://www.illasaron.com/upload");
        tituloPagina[4] = "Illasaron Foros";
        enlacePagina[4] = getURL("http://www.illasaron.com/PHPBB3");
        tituloPagina[5] = "Séptimo Continente";
        enlacePagina[5] = getURL("http://septimocontinente.com");
        Button botonIr = new Button("Ir");
        botonIr.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(botonIr);
    }

    URL getURL(String textoURL) {
        URL paginaURL = null;
        try {
            paginaURL = new URL(getDocumentBase(), textoURL);
        } catch (MalformedURLException m) { }
        return paginaURL;
    }

    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D.setColor(darColor);
        screen2D.fillRect(0, 0, getSize().width, getSize().height);
        screen2D.setColor(Color.black);
        screen2D.drawString(tituloPagina[actual], 5, 60);
        screen2D.drawString("" + enlacePagina[actual], 5, 80);
    }

    public void start() {
        if (ejecutor == null) {
            ejecutor = new Thread(this);
            ejecutor.start();
        }
    }

    public void run() {
    Thread esteThread = Thread.currentThread();
        while (ejecutor == esteThread) {
            actual++;
            if (actual > 5) {
                actual = 0;
            }
            repaint();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                // no hace nada
            }
        }
    }

    /*public void stop() {
        if (ejecutor != null) {
            ejecutor = null;
        }
    }*/

    public void actionPerformed(ActionEvent event) {
        if (ejecutor != null) {
            ejecutor = null;
        }
        AppletContext navegador = getAppletContext();
        if (enlacePagina[actual] != null) {
            navegador.showDocument(enlacePagina[actual]);
        }
    }
}
