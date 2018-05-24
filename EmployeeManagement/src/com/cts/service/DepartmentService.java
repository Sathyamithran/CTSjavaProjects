package com.cts.service;

import java.util.List;

import com.cts.model.Employee;

public class DepartmentService 
{
		public Boolean addDepartment(Department dept);
		public Department Department (int id);
		public List<Department> getAllDepartments();
		public Boolean deleteDepartment(int id);   //cascade on delete?
		public Boolean updateDepartment(Department dept);
		public Boolean addEmployeeToDepartment(int empID, int deptID);
		public Boolean deleteEmployeeFromDepartment(int empID, int deptID);
		public List<Employee>  getAllEmployees(int deptID);


}