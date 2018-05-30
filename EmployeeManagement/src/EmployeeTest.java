import java.util.List;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;
import com.cts.service.Impl.EmployeeServiceImpl;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		EmployeeService employee = new EmployeeServiceImpl();
		
		//creating the employee list
		Employee candidate1 = new Employee(1, "sam", 1000, 101);
		Employee candidate2 = new Employee(2, "mith", 2000, 102);
		Employee candidate3 = new Employee(3, "reva", 2000, 101);
		Employee candidate4 = new Employee(4, "samy", 4000, 102);
		Employee candidate5 = new Employee(5, "dinu", 6000, 102);
		Employee candidate6 = new Employee(6, "sarav", 5000, 101);
		Employee candidate7 = new Employee(7, "shaz", 8000, 101);
		Employee candidate8 = new Employee(8, "dil", 7000, 102);
		Employee candidate9 = new Employee(9, "xav", 9000, 101);
		
		//display before adding employee
		System.out.println("Before adding the records\n");
		employee.display();
		
		
		//adding employee to the list
		employee.addEmployee(candidate1);
		employee.addEmployee(candidate2);
		employee.addEmployee(candidate3);
		employee.addEmployee(candidate4);
		employee.addEmployee(candidate5);
		employee.addEmployee(candidate6);
		employee.addEmployee(candidate7);
		employee.addEmployee(candidate8);
		employee.addEmployee(candidate9);
		
		//display after adding employee
		System.out.println("\nAfter adding the records");
		employee.display();
		
		
		//delete the specific employee from the employee list
		System.out.println("\nRemoving the a record in the list");
		employee.deleteEmployee(3);
		employee.display();
		
		
		//readding the record 3 after deleteing
		employee.addEmployee(candidate3);
		
		
		//display the all the employees according to salary
		System.out.println("\nemployees according to salary");
		List<Employee> listsalary = employee.getAllEmployees(2000);
		employee.getAllEmployees(2000);
		employee.display(listsalary);
		
		//display the all the employees with in the given range
		List<Employee> list = employee.getAllEmployees(2000,4000);
		System.out.println("\nemployees within the given minimum and maximum");
		employee.display(list);

		
		
		
	}

}
