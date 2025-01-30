package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import  java.sql.Statement;
public class NonStaticData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotraining?useSSL=false", "root", "Pavanprem@2048naidu");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from students");
	    while(resultSet.next())
	    {
	    	System.out.println(resultSet.getInt(1) + " "  + resultSet.getString(2) );
	    			
	    }
	    connection.close();
	
	}
	
	
}