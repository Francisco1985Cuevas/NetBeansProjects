/*

 */
package sessionbeanprimeroappclient;

import com.cursojavaee.sessionbeanprimero.ejb.RepetirRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

public class Main {

    @EJB
    private static RepetirRemote repetir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //simplemente llamamos al metodo repetir
        JOptionPane.showMessageDialog(null, repetir.repetir("Si ves este mensaje es que todo ha funcionado bien"));
        
    }
    
}
