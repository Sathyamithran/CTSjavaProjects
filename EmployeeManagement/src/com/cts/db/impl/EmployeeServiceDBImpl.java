package com.cts.db.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.cts.db.impl.DBConnection;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceDBImpl implements EmployeeService 
{	Connection con;
	Statement statement;
	PreparedStatement prepare;
	
	ArrayList<Employee> empdetails = new ArrayList<Employee>();

	//getting the employee checking before into list 
	@Override
	public Employee getEmployee(int id) 
	{
		for(Employee emp:empdetails)
		{
			if(emp.getId()==id)
			{
				return emp;
			}
		}
		return null;
	}

	
	//adding an employee the list
	@Override
	public Boolean addEmployee(Employee emp) 
	{
		con = DBConnection.getConnection();
		try 
		{
			prepare = con.prepareStatement("insert into employee values (?,?,?,?)");
			prepare.setInt(1, emp.getId());
			prepare.setString(2, emp.getName());
			prepare.setInt(3, emp.getSalary());
			prepare.setInt(4, emp.getDepartment());
			prepare.executeUpdate();
			return true;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	//deleteing an employee in the list 
	@Override
	public Boolean deleteEmployee(int id) 
	{
		try 
		{
			con = DBConnection.getConnection();

			prepare = con.prepareStatement("delete from employee where emp_id = ?");
			prepare.setInt(1, id);
			prepare.executeUpdate();
		
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	//update the employee in the list
	@Override
	public Boolean updateEmployee(Employee emp) 
	{
		con = DBConnection.getConnection();
		try 
		{
			prepare = con.prepareStatement("update employee set emp_salary = 5000 where emp_id = ?");
			prepare.setInt(1, emp.getId());
			prepare.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}


	//get all the employee in the list
	@Override
	public List<Employee> getAllEmployees() 
	{
		con = DBConnection.getConnection();
		ResultSet resultset;
		Employee emp ;
		List<Employee> emplist = new ArrayList<Employee>();
		try 
		{
			statement = con.createStatement();
			resultset = statement.executeQuery("select * from employee");
			while(resultset.next())
			{
				emp = new Employee();
				emp.setId(resultset.getInt(1));
				emp.setName(resultset.getString(2));
				emp.setSalary(resultset.getInt(3));
				emp.setDepartment(resultset.getInt(4));
				
				
				emplist.add(emp);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
	}

	
	//get all the employee list using the salary
	@Override
	public List<Employee> getAllEmployees(int salary) 
	{

		con = DBConnection.getConnection();
		ResultSet resultset;
		Employee emp ;
		List<Employee> emplist = new ArrayList<Employee>();
		try 
		{
			prepare = con.prepareStatement("select * from employee where emp_salary = ?");
			prepare.setInt(1, salary);
			prepare.executeQuery();
			
			
			while(((ResultSet) prepare).next())
			{
				emp = new Employee();
				emp.setId(((ResultSet) prepare).getInt(1));
				emp.setName(((ResultSet) prepare).getString(2));
				emp.setSalary(((ResultSet) prepare).getInt(3));
				emp.setDepartment(((ResultSet) prepare).getInt(4));
				
				
				emplist.add(emp);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
	}
	

	//get all the employee list using the range of salary
	@Override
	public List<Employee> getAllEmployees(int minSalary, int maxSalary) 
	{
		//ArrayList<Employee> employee = empdetails;
		ArrayList<Employee> empdetailsminmax = new ArrayList<Employee>();
		con = DBConnection.getConnection();
		try 
		{
			prepare = con.prepareStatement("select * from employee where emp_salary >= ? and emp_salary <= ?");
			prepare.setInt(1, minSalary);
			prepare.setInt(2, maxSalary);
			prepare.executeUpdate();
			
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empdetailsminmax;
	}

	
	//display as object from passing the list
	@Override
	public void display(List<Employee> list) 
	{
		/*for(Employee emp: list)
		{
			
			display(emp);
		}*/
		
		con = DBConnection.getConnection();
		
		try 
		{
			prepare = con.prepareStatement("select emp_id from employee");
			prepare.executeUpdate();
						
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	//display passing the object
	public void display()
	{
		for(Employee emp:empdetails)
		{
			display(emp);
		}
		
	}
	
	//display method
	@Override
	public void display(Employee emp) 
	{
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}


	@Override
	public List<Employee> getAllEmployeesByDept(int deptID) 
	{
		List<Employee> deptEmployees = new  ArrayList<Employee>();
	/*	for(Employee emp:empdetails)
		{
			if(emp.getDepartment()==deptID)
			{
				deptEmployees.add(emp);
			}
		}*/
		
		con = DBConnection.getConnection();
		try 
		{
			prepare = con.prepareStatement("select * from employee where dept_id = ?");
			prepare.setInt(1, deptID);
			prepare.executeUpdate();
						
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return deptEmployees;

		
	}


	@Override
	public boolean validate(String username, String password) 
	{
		if(username.equals("niit")&&password.equals("niit"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
