/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clasesdb.Tornillo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author francisco
 */
public class daoTornillo {
    
    //Tenemos que crear todos los metodos para crear,leer,actualizar,
    //borrar registros.
    
    //nos va a devolver el id del tornillo que demos de alta
    public static Long altatornillo(Tornillo tornillo) throws SQLException{
        
        Connection conexion = null;
        PreparedStatement statement = null;
        ResultSet claves = null;
        Long clave = null;
        
        try{
            Class.forName("org.postgresql.Driver");
            
        }catch(ClassNotFoundException e){
            System.out.println("No se ha encontrado el driver de postgreSQL");
            //print de la fila de excepcion
            e.printStackTrace();
            
        }
        
        conexion = new Conexion().getC();
        if(conexion!=null){
            try{
                String SQL_INSERT;
                SQL_INSERT = "INSERT INTO ferreteria.tornillo(cabeza, cuello, diametro, tiporosca, paso, longitud, idfabricante_fabricante, codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
            
                statement = conexion.prepareStatement(SQL_INSERT, statement.RETURN_GENERATED_KEYS); //va a introducir en los statement esa sentencia SQL y vamos a decirle a statement que lo queremos es que nos devuelva la clave o claves generadas en la ejecucion de estas sentencias
                statement.setString(1, tornillo.getCabeza());
                statement.setInt(2, tornillo.getCuello());
                statement.setInt(3, tornillo.getDiametro());
                statement.setString(4, tornillo.getTiporosca());
                statement.setInt(5, tornillo.getPaso());
                statement.setInt(6, tornillo.getLongitud());
                statement.setLong(7, tornillo.getIdfabricante());
                statement.setString(8, tornillo.getCodigo());
            
                int affectedRows = statement.executeUpdate();
                if(affectedRows == 0){
                    throw new SQLException("Error dando de alta el tornillo, no existen filas afectadas");
                }
            
                claves = statement.getGeneratedKeys();
                if(claves.next()){
                    System.out.println("Se ha insertado el registro con ID: "+claves.getLong(1));
                    clave = claves.getLong(1);
                }else {
                    throw new SQLException("Error dando de alta al tornillo, no se ha generado clave");
                }
            }finally{
                if(claves != null){ try{ claves.close(); }catch(SQLException logOrIgnore){} }
                if(statement != null){ try{ statement.close(); }catch(SQLException logOrIgnore){} }
                if(conexion != null){ try{ statement.close(); }catch(SQLException logOrIgnore){} }
            }
            
        }//fin conexion!=null
        
        return clave;
        
    }//fin metodo altatornillo
    
}//fin clase








