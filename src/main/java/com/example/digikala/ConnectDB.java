package com.example.digikala;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class ConnectDB {
    static private Statement statement;
    public ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","12345678");
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products WHERE Category = 'Mobile'");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet query(String sql){
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}