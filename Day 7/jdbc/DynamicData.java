package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicData {

		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotraining?useSSL=false", "root", "Pavanprem@2048naidu");
			//PreparedStatement ps = connection.prepareStatement("insert into students values(?,?)");
			PreparedStatement ps = connection.prepareStatement("UPDATE students SET sname= ? WHERE sid = ?");
			Scanner S = new Scanner(System.in);
			System.out.println("enter the student Name:");
			String sname=S.next();
			System.out.println("enter the student id:");
			int sid=S.nextInt();
			ps.setString(1, sname);
			ps.setInt(2, sid);
			int x = ps.executeUpdate();
			System.out.println(x + "row(s) updated");
			connection.close();
		}
	}
	 
			

	

