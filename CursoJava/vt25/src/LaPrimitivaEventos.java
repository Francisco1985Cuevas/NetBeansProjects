//importamos los paquetes que necesitamos
import javax.swing.*;
import java.awt.event.*;

//las clases ItemListener, ActionListener: son necesarias para 
//vigilar los eventos generados por los botones y las cajas de 
//checkeo de nuestra AP nos van a avisar para que se ejecuten
//distintos metodos cuando haya cualquier cambio en esos 
//componentes vigilados
//la interface Runnable: vamos a usar para crear los threads



//creamos la clase LaPrimitivaEventos implementa la herencia 
//ItemListener, ActionListener, Runnable
public class LaPrimitivaEventos implements ItemListener, ActionListener, Runnable {
    
    //variables de instancia
    LaPrimitiva gui;
    Thread jugando;

    public LaPrimitivaEventos(LaPrimitiva in) {
        gui = in;
    }
    
    //encargado de recibir los eventos cuando un usuario
    //pulse un boton, segun el boton que se haya pulsado
    //se llamara a un metodo distinto
    public void actionPerformed(ActionEvent event) {
        String comando = event.getActionCommand();
        if (comando.equals("Jugar")) {
            empezarJuego();
        }
        if (comando.equals("Parar")) {
            pararJuego();
        }
        if (comando.equals("Reiniciar")) {
            limpiarCampos();
        }
    }
    
    //boton jugar, habilita o deshabilita componentes
    void empezarJuego() {
        jugando = new Thread(this);
        jugando.start();
        gui.jugar.setEnabled(false);
        gui.parar.setEnabled(true);
        gui.reiniciar.setEnabled(false);
        gui.automatico.setEnabled(false);
        gui.manual.setEnabled(false);
    }
    
    //detenemos jugando
    void pararJuego() {
        gui.parar.setEnabled(false);
        gui.jugar.setEnabled(true);
        gui.reiniciar.setEnabled(true);
        gui.automatico.setEnabled(true);
        gui.manual.setEnabled(true);
        jugando = null;
    }
    
    //configura o limpia todos los campos de texto a cero (0)
    void limpiarCampos() {
        for (int i = 0; i < 6; i++) {
            gui.numeros[i].setText(null);
            gui.ganadores[i].setText(null);
        }
        gui.obtener3.setText("0");
        gui.obtener4.setText("0");
        gui.obtener5.setText("0");
        gui.obtener6.setText("0");
        gui.intentos.setText("0");
        gui.years.setText("0");
    }
    
    //es el que recibe los eventos de usuario cuando se marque
    //las cajas de checkeo
    public void itemStateChanged(ItemEvent event) {
        Object item = event.getItem();
        if (item == gui.automatico) {
            for (int i = 0; i < 6; i++) {
                int eleccion;
                do {
                    eleccion = (int) Math.floor(Math.random() * 50 + 1);
                } while (numeroRepetido(eleccion, gui.numeros, i));
                gui.numeros[i].setText("" + eleccion);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                gui.numeros[i].setText(null);
            }
        }
    }
    
    //convertir el campo de texto en uno e incrementarlo en uno.
    void addUnoACampo(JTextField field) {
        int num = Integer.parseInt("0" + field.getText());
        num++;
        field.setText("" + num);
    }
    
    //este metodo es el encargado de asegurarse que los numeros que
    //se seleccionen aleatoriamente no haya sido seleccionado ya
    boolean numeroRepetido(int num, JTextField[] pastNums, int count) {
        for (int i = 0; i < count; i++) {
            if (Integer.parseInt(pastNums[i].getText()) == num) {
                return true;
            }
        }
        return false;
    }
    
    //comparar el numero que ha salido con los que estan escritos
    //para ver si coinciden o no
    boolean compararNumeros(JTextField win, JTextField[] allPicks) {
        for (int i = 0; i < 6; i++) {
            String winText = win.getText();
            if ( winText.equals( allPicks[i].getText() ) ) {
                return true;
            }
        }
        return false;
    }
    
    //implementamos método de la interface Runnable
    public void run() {
        Thread thisThread = Thread.currentThread();
        while (jugando == thisThread) {
            addUnoACampo(gui.intentos);
            int draw = Integer.parseInt(gui.intentos.getText());
            float numYears = (float)draw / 104;
            gui.years.setText("" + numYears);

            int matches = 0;
            for (int i = 0; i < 6; i++) {
                int bola;
                do {
                    bola = (int) Math.floor(Math.random() * 50 + 1);
                } while (numeroRepetido(bola, gui.ganadores, i));
                gui.ganadores[i].setText("" + bola);
                if (compararNumeros(gui.ganadores[i], gui.numeros)) {
                    matches++;
                }
            }
            switch (matches) {
                case 3:
                    addUnoACampo(gui.obtener3);
                    break;
                case 4:
                    addUnoACampo(gui.obtener4);
                    break;
                case 5:
                    addUnoACampo(gui.obtener5);
                    break;
                case 6:
                    addUnoACampo(gui.obtener6);
                    gui.parar.setEnabled(false);
                    gui.jugar.setEnabled(true);
                    jugando = null;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // no hacer nada
            }
        }
    }
}
