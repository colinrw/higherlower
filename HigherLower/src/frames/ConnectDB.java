package frames;


import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class ConnectDB {
    private Connection connection;
    
    public ConnectDB(){
     //Makes connection with the database
        String database = "jdbc:mysql://localhost:3306/higherlower";
        String username = "root";
        String password = "pipode67";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(database, username, password);     
           
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }    
    }    
    
    public Connection connect(){
        return this.connection;
    }
}
