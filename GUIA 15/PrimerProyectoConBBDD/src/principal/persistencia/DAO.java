/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author chris
 */
public abstract class DAO {
    
    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "bbdd_jdbc";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    protected void conectarBase() throws ClassNotFoundException, SQLException{
        
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/"+ DATABASE + "?useSSL = false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){
            throw ex;
        }        
    }
    
    protected void desconectarBase() throws Exception{
        try {
            if (resultado != null) {
                resultado.close();
            }
            
            if (sentencia != null) {
                sentencia.close();
            }
            
            if (conexion != null) {
                conexion.close();
            }
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    protected void insertarModificarEliminar(String sql) throws SQLException, ClassNotFoundException, Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException |  ClassNotFoundException ex) {            
            throw ex;
        }finally{
            desconectarBase();
        }
    }
    
    protected void consultarBase(String sql) throws Exception{
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }    
}
