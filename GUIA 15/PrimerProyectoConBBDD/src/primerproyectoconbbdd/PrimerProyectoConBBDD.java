/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerproyectoconbbdd;


import java.sql.*;

/**
 *
 * @author chris
 */
public class PrimerProyectoConBBDD {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//
//        Connection con;
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            //Class.forName("com.mysql.cj.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/tienda?zeroDateTimeBehavior=convertToNull";
//            con = DriverManager.getConnection(url, "root", "root");
//            
//            Statement stmt = con.createStatement();
//            String sentenciaSQL = "SELECT * FROM producto";
//            ResultSet result = stmt.executeQuery(sentenciaSQL);
//            System.out.println("QUERY:");
//            while (result.next()) {
//                //System.out.println(result.getString(url));
//                String s = result.getString("nombre");
//                System.out.println(result.getRow() + "\t" + s);
//            }  
//        } catch (ClassNotFoundException | SQLException ex) {
//            System.out.println("FALLA");
//            System.out.println(ex);
//        }
//    }   
}
