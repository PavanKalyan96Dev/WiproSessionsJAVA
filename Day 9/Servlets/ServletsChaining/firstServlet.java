package com.servletchaining;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().println("i am first servlet");
		RequestDispatcher rd=request.getRequestDispatcher("SecondServlet");
		//forwarding the request to servlet 2
		//rd.forward(request, response);
		rd.include(request, response);//it is used to get the dataa from the second servelet from the first servelet;
		
	}

}
