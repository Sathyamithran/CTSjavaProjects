package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;
import com.cts.service.Impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeController() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id = Integer.parseInt(request.getParameter("id"));
		String  name = request.getParameter("name");
		int  salary = Integer.parseInt(request.getParameter("salary"));
		int  deptid = Integer.parseInt(request.getParameter("deptid"));
		
		EmployeeService empservice = new EmployeeServiceImpl();
		Employee emp = new Employee(id,name,salary,deptid);
		
		empservice.addEmployee(emp);
		
		RequestDispatcher dispatcher;
		
		if(id == 100)&&(name.equals("niit"))
		{
			dispatcher = request.getRequestDispatcher("sucess.html");
			dispatcher.forward(request, response);
		}
		else
		{
			dispatcher = request.getRequestDispatcher("employee.html");
			PrintWriter writer = response.getWriter();
			writer.append("Invalid credentials....please enter again");
			dispatcher.include(request, response);
		}
		
		doGet(request, response);
	}

}
