package com.francisco.jsp.mysql;

import java.sql.*;

public class Conectar {
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
            
            Class.forName("com.francisco.jsp.mysql");
            this.con = DriverManager.getConnection("jdbc:mysql://"+this.server+"/"+this.bd, this.user, this.pass);
            
            //String sDriver = "com.francisco.jsp.mysql";
            //String sURL = "jdbc:mysql://localhost:3306/test";
            //Class.forName(sDriver);    
            //this.con = DriverManager.getConnection(sURL,"root","");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
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
