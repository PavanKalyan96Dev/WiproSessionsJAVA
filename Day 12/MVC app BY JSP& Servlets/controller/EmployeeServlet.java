package com.wipro.controller;



import java.io.IOException;
import java.util.List;

import com.wipro.DataAccessObject.EmployeeDAO;
import com.wipro.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/EmployeeServlet")

public class EmployeeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	

	private EmployeeDAO employeeDAO = new EmployeeDAO();



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name=request.getParameter("name");

		String department=request.getParameter("department");

		Employee emp=new Employee( 0,name,department);

		employeeDAO.addEmployee(emp);

		doGet(request, response);



	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Employee> employees = employeeDAO.getEmployees();

		request.setAttribute("employees", employees);

		request.getRequestDispatcher("viewEmployees.jsp").forward(request, response);

		

	}



}

