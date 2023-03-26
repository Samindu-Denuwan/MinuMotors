
package com.bike.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DB {
    private static Connection connection;
    
    private static void ini_DB() throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/bike_service_center", "root", "9280");
    }
    public static void push (String sql) throws Exception{
        if(connection == null){
            ini_DB();
        }
        connection.createStatement().executeUpdate(sql);
    }
    public static ResultSet search (String sql) throws Exception{
        if(connection == null){
            ini_DB();
        }
        return connection.createStatement().executeQuery(sql);
    }
    public static Connection getDBConnection()throws Exception{
        if(connection == null){
            ini_DB();
            
        }
        return connection;
        
    }
}
