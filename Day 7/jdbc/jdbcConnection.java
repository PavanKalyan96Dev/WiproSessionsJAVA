package com.jdbc;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded");

        // Establishing connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotraining?useSSL=false", "root", "Pavanprem@2048naidu");
        System.out.println("I got the connection from DB");

        // Creating statement
        Statement statement = connection.createStatement();

        // Inserting multiple rows
        int x = statement.executeUpdate("INSERT INTO students VALUES (1, 'pavan'), (2, 'prem'), (3, 'srinivasulu')");
        System.out.println(x + " row(s) inserted");

      //delete 
//        int y = statement.executeUpdate("DELETE FROM students WHERE sid = 3");  
//        System.out.println(y + " row(s) deleted");
        
        //update
//        int z=statement.executeUpdate("update  students set sid=123 where sid=2 ");
//        System.out.println(z + " row(s) updated");
        
        //alter
//        int ab=statement.executeUpdate("ALTER TABLE students ADD COLUMN email VARCHAR(100)");
//        System.out.println(ab);
        
      //  drop
//        int bc=statement.executeUpdate("drop table students");
//        System.out.println("table is removed");
// 

        // Closing resources
        statement.close();
        connection.close();
    }
}
