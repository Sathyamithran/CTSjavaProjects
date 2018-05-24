package com.cts.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService 
{

	ArrayList<Employee> empdetails = new ArrayList<Employee>();
	
	
	
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

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int minSalary, int maxSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
