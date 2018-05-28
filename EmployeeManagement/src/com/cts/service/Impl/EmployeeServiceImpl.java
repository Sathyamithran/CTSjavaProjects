package com.cts.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService 
{

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
		if(getEmployee(emp.getId())!=null)
		{
			return false;
		}
		empdetails.add(emp);

		return true;
	}

	//deleteing an employee in the list 
	@Override
	public Boolean deleteEmployee(int id) 
	{
		Employee emp1 = getEmployee(id);
		if(emp1 != null)
		{
			empdetails.remove(emp1);
		}

		return null;
	}

	
	
	//update the employee in the list
	@Override
	public Boolean updateEmployee(Employee emp) 
	{
		if(getEmployee(emp.getId())==null)
		{
			return false;
		}
		empdetails.remove(emp.getId());
		
		empdetails.add(emp);
		return true;
	}


	//get all the employee in the list
	@Override
	public List<Employee> getAllEmployees() 
	{
		
		return empdetails;
	}

	
	//get all the employee list using the salary
	@Override
	public List<Employee> getAllEmployees(int salary) 
	{
		
		ArrayList<Employee> empdetailssalary = new ArrayList<Employee>();
		for(Employee emp:empdetails)
		{
			if(emp.getSalary()==salary)
			{
				empdetailssalary.add(emp);
			}
		}
		return empdetailssalary;
	}
	

	//get all the employee list using the range of salary
	@Override
	public List<Employee> getAllEmployees(int minSalary, int maxSalary) 
	{
		//ArrayList<Employee> employee = empdetails;
		ArrayList<Employee> empdetailsminmax = new ArrayList<Employee>();
		
		for(Employee emp:empdetails)
		{
			if((emp.getSalary()>=minSalary)&&(emp.getSalary()<=maxSalary))
			{
				empdetailsminmax.add(emp); 
			}
		}

		return empdetailsminmax;
	}

	
	//display as object from passing the list
	@Override
	public void display(List<Employee> list) 
	{
		for(Employee emp: list)
		{
			
			display(emp);
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
	
}
