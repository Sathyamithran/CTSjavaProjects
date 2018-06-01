package com.cts.service;

import java.util.List;

import com.cts.model.Employee;

public interface EmployeeService 
{
	public Boolean addEmployee(Employee emp);
	public Boolean deleteEmployee(int id);
	public Boolean updateEmployee(Employee emp);
	
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployees();
	public List<Employee> getAllEmployeesByDept(int deptID);
	public List<Employee> getAllEmployees(int salary);
	public List<Employee> getAllEmployees(int minSalary, int maxSalary);
	
	public void display(List<Employee> empsalarylist);
	public void display(Employee emp);
	public void display();
	public boolean validate(String username,String password);

}
