package com.cts.model;

import java.util.ArrayList;
import java.util.List;

public class Department 
{
	private int departmentId;
	private String departmentname;
	private Employee employee;
	
	//getter setter methods
	public int getDepartmentId() 
	{
		return departmentId;
	}
	public void setDepartmentId(int departmentId) 
	{
		this.departmentId = departmentId;
	}
	public String getDepartmentname() 
	{
		return departmentname;
	}
	public void setDepartmentname(String departmentname) 
	{
		this.departmentname = departmentname;
	}
	public Employee getEmployee() 
	{
		return employee;
	}
	public void setEmployee(Employee employee) 
	{
		this.employee = employee;
	}
	
	
	
	//constructor
	public Department(int departmentId, String departmentname, Employee employee) 
	{
		super();
		this.departmentId = departmentId;
		this.departmentname = departmentname;
		this.employee = employee;
	}

	
	
}
