
package com.cts.service;

import java.util.List;
import com.cts.model.Department;
import com.cts.model.Employee;

public interface DepartmentService 
{
		public Boolean addDepartment(Department dept);
		public Boolean deleteDepartment(int id);   //cascade on delete?
		public Boolean updateDepartment(Department dept);
		
		public void getAllDepartName();
		public Department getDepartment(int id);
		public List<Department> getAllDepartments();
		public List<Employee>  getAllEmployees(int deptID);
		public List<Employee>  getAllEmployees(int deptID, int amount);
		public List<Employee>  getAllEmployees(int deptID, int min, int max);
		
		public void dislay();
		public void dislay(Department dept);
		public Boolean addEmployeeToDepartment(int empID, int deptID);
		public Boolean deleteEmployeeFromDepartment(int empID, int deptID);
		


}
