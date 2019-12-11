//importamos los paquetes que vamos a usar
import javax.swing.*;
import java.awt.*;
import java.util.*;

//extendemos de la clase JPanel
public class PanelReloj extends JPanel{ 
    
    //1-) Para empezar vamos a tener que llamar al
    //constructor de la superclase JPanel, lo hacemos 
    //mediante el uso de super().
    public PanelReloj(){
        super(); 
        
        //recuperamos la informaciones que queremos que se muestre en el panel
        String tiempoActual = getTiempo(); 
        
        //se crea etiqueta(componente)
        JLabel tiempo = new JLabel("Fecha: ");
        //se crea una segunda etiqueta en la que
        //se muestra la informacion que recuperamos
        JLabel actual = new JLabel(tiempoActual); 
        
        //anhadir dentro del contenedor los componentes creados
        add(tiempo); 
        add(actual);
    }

    String getTiempo(){
        String tiempo;
        // obtener fecha y hora actual
        Calendar ahora = Calendar.getInstance();
        int hora = ahora.get(Calendar.HOUR_OF_DAY);
        int minuto= ahora.get(Calendar.MINUTE);
        int mes = ahora.get(Calendar.MONTH) + 1;
        int dia = ahora.get(Calendar.DAY_OF_MONTH);
        int year = ahora.get(Calendar.YEAR);
        
        String nombreMes = "";
        switch(mes){
            case(1):
                nombreMes = "Enero";
                break;
            case(2):
                nombreMes = "Febrero";
                break;
            case(3):
                nombreMes = "Marzo";
                break;
            case(4):
                nombreMes = "Abril";
                break;
            case(5):
                nombreMes = "Mayo";
                break;
            case(6):
                nombreMes = "Junio";
                break;
            case(7):
                nombreMes = "Julio";
                break;
            case(8):
                nombreMes = "Agosto";
                break;
            case(9):
                nombreMes = "Septiembre";
                break;
            case(10):
                nombreMes = "Octubre";
                break;
            case(11):
                nombreMes = "Noviembre";
                break;
            case(12):
                nombreMes = "Diciembre";
        }
        
        tiempo = dia+" de "+nombreMes+" de "+year+".  "+" Hora:  "+hora+":"+minuto;
        return tiempo;
    }
}
