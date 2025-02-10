package com.wipro.DataAccessObject;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;



import com.wipro.model.Employee;



public class EmployeeDAO {

	

	/*

	 * private static List<Employee> employees =new ArrayList();

	 * 

	 * Employee obj=new Employee();

	 * 

	 * public static void AddEmployee(Employee emp) { employees.add(emp); }

	 * 

	 * public static List<Employee> GetEmployees(){ return employees;

	 * 

	 * }

	 */

	public EmployeeDAO()

	{

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

		}

		catch(Exception e)

		{

			e.printStackTrace();

		}

	}

	

	//add Employee to database

	

	public static void addEmployee(Employee emp)

	{

		String sql = "insert into employees(name,department) values(?,?)";

		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db?useSSL=false","root","Pavanpremnaidu");

				PreparedStatement stmt  = conn.prepareStatement(sql)){

			stmt.setString(1, emp.getName());

			stmt.setString(2, emp.getDepartment());

			stmt.executeUpdate();

			

			

		}

		catch(SQLException e)

		{

			e.printStackTrace();

		}

	}

	

	//Retrieve employees from database

	

	public static List<Employee> getEmployees()

	{

		

		List<Employee> employees  = new ArrayList<>();

		String sql = "SELECT * FROM employee";

		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?useSSL=false","root","Pavanprem@2048naidu");

				PreparedStatement stmt = conn.prepareStatement(sql);

				ResultSet rs = stmt.executeQuery())

		{

			while(rs.next()) {

				Employee emp = new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("department"));

				employees.add(emp);

			}

		}

		catch(SQLException e)

		{

			e.printStackTrace();

		}

		return employees;

	}

	

	

	

	

}

	





