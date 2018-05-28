package com.cts.model;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private int deptId;
	private String deptname;
	private Employee employee;
	
	

	//constructor
	public Department(int departmentId, String departmentName) 
	{
		super();
		this.deptId = departmentId;
		this.deptname = departmentName;
		this.employee = employee;
	}


	//getter setter methods
	public int getDepartmentId() 
	{
		return deptId;
	}
	public void setDepartmentId(int departmentId) 
	{
		this.deptId = departmentId;
	}
	public String getDepartmentName() 
	{
		return deptname;
	}
	public void setDepartmentName(String departmentName) 
	{
		this.deptname = departmentName;
	}
	public Employee getEmployee() 
	{
		return employee;
	}
	public void setEmployee(Employee employee) 
	{
		this.employee = employee;
	}
	
	
	
	
}
