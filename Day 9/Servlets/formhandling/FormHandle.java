package com.FormHandling;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FormHandle
 */
@WebServlet("/FormHandle")
public class FormHandle extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		int x = Integer.parseInt(request.getParameter("t1"));

		int y = Integer.parseInt(request.getParameter("t2"));
		int z = x+y;
		request.getRequestDispatcher("/Form.html").include(request, response);
		out.println("sum is "+z);
		
		}
	}


