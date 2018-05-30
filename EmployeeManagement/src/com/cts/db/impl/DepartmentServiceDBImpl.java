package com.cts.db.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;

import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.service.Impl.EmployeeServiceImpl;

public class DepartmentServiceDBImpl implements DepartmentService 
{
	
	ArrayList<Department> deptlist = new ArrayList<Department>();

	@Override
	public Department getDepartment(int id) 
	{
		for(Department dept:deptlist)
		{
			if(dept.getDepartmentId() == id)
			{
				return dept;
			}
		}
		
		return null;
	}
	

	@Override
	public Boolean addDepartment(Department dept) 
	{
		if(getDepartment(dept.getDepartmentId())!=null)
		{
			return false;
		}
		deptlist.add(dept);
		return null;
	}

	@Override
	public Boolean deleteDepartment(int id) 
	{
		Department dept1 = getDepartment(id);
		if(dept1 != null)
		{
			deptlist.remove(dept1);
		}
		
		return null;
	}

	@Override
	public Boolean updateDepartment(Department dept) 
	{
		if(getDepartment(dept.getDepartmentId())==null)
		{
			return false;
			
		}
		deptlist.remove(dept.getDepartmentId());
		deptlist.add(dept);
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
	public Boolean addEmployeeToDepartment(int empID, int deptID) 
	{
	
		return null;
	}

	@Override
	public Boolean deleteEmployeeFromDepartment(int empID, int deptID) 
	{
	
		return null;
	}


	@Override
	public void display() 
	{
		for(Department dept:deptlist)
		{
			display(dept);
		}
		
	}

	
	@Override
	public void display(Department dept) 
	{
		System.out.println(dept.getDepartmentId());
		System.out.println(dept.getDepartmentName());
		
		
	}


	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return deptlist;
	}


	@Override
	public void getAllEmployees(int deptID) 
	{
		
		EmployeeServiceImpl employee = new EmployeeServiceImpl();
		
		for(Employee employeeOnDept:employee.getAllEmployeesByDept(deptID))
		{
			
		}
		
	}

}
