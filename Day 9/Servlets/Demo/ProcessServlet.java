package com.wipro;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
* Servlet implementation class ProcessServlet
*/
@WebServlet("/process")
public class ProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

/**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
   */
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{

	int x = Integer.parseInt(request.getParameter("t1"));

	int y = Integer.parseInt(request.getParameter("t2"));
	int z = x+y;
	response.getWriter().println("sum is "+z);
	}
}




