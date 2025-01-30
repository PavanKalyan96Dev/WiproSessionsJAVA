package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotraining?useSSL=false", "root", "Pavanprem@2048naidu");
	 // Creating statement
    Statement statement = connection.createStatement();
    PreparedStatement ps = connection.prepareStatement("delete from students where sid=?");
    Scanner S = new Scanner(System.in);
	
	System.out.println("enter the student id:");
	int sid=S.nextInt();
    
	ps.setInt(1, sid);
	int x = ps.executeUpdate();
	System.out.println(x + "row(s) deleted");
	
	//select statement after deletion
	ResultSet resultSet = statement.executeQuery("select * from students");
    while(resultSet.next())
    {
    	System.out.println(resultSet.getInt(1) + " "  + resultSet.getString(2) );
    			
    }
	connection.close();
	

	}

}
