/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeanprimeroappclient;

import com.cursojavaee.sessionbeanprimero.ejb.RepetirRemote;
import javax.ejb.EJB;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class Main {

    @EJB
    private static RepetirRemote repetir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, repetir.repetir("Si ves este mensaje es que todo ha funcionado bien"));
        
    }
    
}
