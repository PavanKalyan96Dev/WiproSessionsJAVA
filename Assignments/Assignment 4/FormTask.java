package com.Task;

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
public class FormTask extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();

		// Fetching input values
		int x = Integer.parseInt(request.getParameter("t1"));
		int y = Integer.parseInt(request.getParameter("t2"));
		String operation = request.getParameter("operation");

		// Variable to store the result
		int result = 0;
		String operationType = "";

		// Performing the respective operation
		switch(operation) {
			case "sum":
				result = x + y;
				operationType = "Addition";
				break;
			case "sub":
				result = x - y;
				operationType = "Subtraction";
				break;
			case "mul":
				result = x * y;
				operationType = "Multiplication";
				break;
			case "div":
				if (y != 0) {
					result = x / y;
					operationType = "Division";
				} else {
					out.println("<h3 style='color:red;'>Error: Cannot divide by zero!</h3>");
					return;
				}
				break;
			default:
				out.println("<h3 style='color:red;'>Invalid operation</h3>");
				return;
		}

		// Including the form again to show the result
		request.getRequestDispatcher("/task.html").include(request, response);
		out.println("<h3>" + operationType + " Result: " + result + "</h3>");
	}
}
