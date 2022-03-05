/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectjdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aprendiz
 */
public class ConectJDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String Drive="com.mysql.jdvc.Drive";
        String url="jdbc:mysql://localhost:3306/petmanagerdb";
        String user="root";
        String pass="";
        
        Connection connection;
        
        connection=DriverManager.getConnection(url, user, pass);
         if(connection!=null){
             System.out.println("¡Database connected!");}
         else{
             System.out.println("¡Database not connected!");
         }
    }catch(SQLException e){
            System.out.println("¡Error connection!");
    }
}
    
}
