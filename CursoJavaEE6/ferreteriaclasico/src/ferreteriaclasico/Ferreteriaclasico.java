/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaclasico;

import clasesdb.Tornillo;
import dao.daoTornillo;
import java.sql.SQLException;

/**
 *
 * @author francisco
 */
public class Ferreteriaclasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Tornillo tornillo =  new Tornillo("Hexagonal", 12, 5, "rosca 1", 12, 15, 1, "H125R11215");
        Long clave;
        clave = daoTornillo.altatornillo(tornillo);
        
        System.out.println("La clave del nuevo tornillo es: "+clave);
    }
    
}
