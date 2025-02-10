package com.JDBSservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fetchBalance")
public class fetchBalance extends HttpServlet
{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int accno = Integer.parseInt(request.getParameter("accno"));
		try {
		PrintWriter pw = response.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprotraining?useSSL=false", "root", "Pavanprem@2048naidu");
		PreparedStatement ps = connection.prepareStatement("select Balance from ram where AccountNum=?");
		ps.setInt(1, accno);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			pw.println("<h1>");
			pw.println("the available balance is : " + rs.getDouble(1));
			pw.println("</h1>");
			}
		}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}



