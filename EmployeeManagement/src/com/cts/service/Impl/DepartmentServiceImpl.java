package com.cts.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;

import com.cts.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService 
{
	
	ArrayList<Department> deptlist = new ArrayList<Department>();

	@Override
	public Department getDepartment(int id) 
	{


		return null;
	}
	

	@Override
	public Boolean addDepartment(Department dept) 
	{
	
		return null;
	}

	@Override
	public Boolean deleteDepartment(int id) 
	{

		return null;
	}

	@Override
	public Boolean updateDepartment(Department dept) 
	{

		return null;
	}

	@Override
	public void getAllDepartName() 
	{

		
	}

	
	@Override
	public List<Department> getAllDepartments() 
	{
		
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int deptID) 
	{
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int deptID, int amount) 
	{

		return null;
	}

	@Override
	public List<Employee> getAllEmployees(int deptID, int min, int max) 
	{
	
		return null;
	}

	@Override
	public void dislay() 
	{
	
		
	}

	@Override
	public void dislay(Department dept) 
	{
	
		
	}

	@Override
	public Boolean addEmployeeToDepartment(int empID, int deptID) 
	{
	
		return null;
	}

	@Override
	public Boolean deleteEmployeeFromDepartment(int empID, int deptID) 
	{
	
		return null;
	}

		

}
