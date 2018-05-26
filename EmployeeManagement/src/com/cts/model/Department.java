package com.cts.model;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private int deptId;
	private String deptname;
	private Employee employee;
	
	

	//constructor
	public Department(int departmentId, String departmentname, Employee employee) 
	{
		super();
		this.deptId = departmentId;
		this.deptname = departmentname;
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
	public String getDepartmentname() 
	{
		return deptname;
	}
	public void setDepartmentname(String departmentname) 
	{
		this.deptname = departmentname;
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
