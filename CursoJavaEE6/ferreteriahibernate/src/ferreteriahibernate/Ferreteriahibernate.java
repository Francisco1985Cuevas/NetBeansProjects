/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriahibernate;

import clasesdb.Fabricante;
import clasesdb.Tornillo;
import static dao.daoGeneral.alta;

/**
 *
 * @author francisco
 */
public class Ferreteriahibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fabricante fabricante;
        fabricante = new Fabricante();
        fabricante.setIdfabricante(1);
        
        Tornillo tornillo;
        tornillo = new Tornillo();
        //tornillo =  new Tornillo("Hexagonal", 12, 5, "rosca 2", 12, 15, 1, "H125R11216");
        tornillo.setCabeza("plana");
        tornillo.setFabricante(fabricante);
        tornillo.setCuello(13);
        tornillo.setDiametro(6);
        tornillo.setLongitud(20);
        alta(tornillo);
        System.out.println(tornillo.getIdtornillo());
        System.exit(0);
        //Long clave;
        //clave = daoTornillo.altatornillo(tornillo);
        
        //System.out.println("La clave del nuevo tornillo es: "+clave);
        
    }
    
}
