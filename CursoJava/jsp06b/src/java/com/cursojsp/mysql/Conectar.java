/*
 * Class Conectar()
 * a este proyecto se añadio la libreria: MySQL JDBC Driver
 * a esta clase se la llama/invoca desde nuestro proyecto
 */
package com.cursojsp.mysql;

import java.sql.*;

public class Conectar {
    //ESTA CLASE ES LA QUE NO FUNCIONA, INVESTIGAR Y HACER FUNCIONAR
    private Connection con;
    private PreparedStatement consulta;
    private ResultSet datos;
    private String server;
    private String user;
    private String bd;
    private String pass;
    
    public Conectar() {
        this.server = "localhost";
        this.user = "root";
        this.bd = "test";
        this.pass = "";
    }
    
    public void con() throws SQLException{
        try{
            //Class.forName("com.cursojsp.mysql");
            //this.con = DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd, this.user, this.pass);
            
            String sDriver = "com.cursojsp.mysql";
            String sURL = "jdbc:mysql://localhost:3306/test";
            //String sURL = "jdbc:mysql://localhost/test";
            //String sURL = "jdbc:mysql://"+this.server+"/test";
            Class.forName(sDriver);    
            this.con = DriverManager.getConnection(sURL,"root","");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            //String message = e.getMessage();
        }
    }

    public void desconectar() throws SQLException{
        this.con.close();
    }
    
    public ResultSet getDatos() throws SQLException{
        this.con();
        this.consulta = this.con.prepareStatement("select * from personas");
        this.datos = this.consulta.executeQuery();
        return this.datos;
    }
}

