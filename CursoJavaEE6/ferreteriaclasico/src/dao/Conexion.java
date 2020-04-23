/*
 * antes de hacer cualquier consulta tenemos que hacer siempre la
 * conexion a la base de datos, que es el puente que nos va a conectar
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author francisco
 */
public class Conexion {
    private Connection c = null;

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }
    
    public Conexion(){
        
        try{
            Class.forName("org.postgresql.Driver");
            this.c=DriverManager.getConnection("jdbc:postgresql:://localhost:5432/almacen", "postgres", "123");
            System.out.println("Conexion con la base de datos exitosa");
        }catch(Exception e){
            //nos dice el nombre de la Clase en la que se ha producido
            //la excepcion
            System.out.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        
    }
    
}







