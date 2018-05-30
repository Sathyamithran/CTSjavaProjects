import com.cts.model.Department;
import com.cts.service.DepartmentService;
import com.cts.service.Impl.DepartmentServiceImpl;

public class DepartmentTest 
{
	public static void main(String[] args) 
	{
		DepartmentService deptservice = new DepartmentServiceImpl();
		
		//Creating the departments
		Department depttype1 = new Department(101,"Mechanical");
		Department depttype2 = new Department(102,"Computer Science");
		
		//display before adding department in list of departments
		System.out.println("\nBefore adding the records\n");
		//deptservice.display();
		
		//adding Department to the list
		deptservice.addDepartment(depttype1);
		//deptservice.addDepartment(depttype2);
		
		//displaying after adding department in list of departments
		System.out.println("\nBefore adding the records\n");
	//	deptservice.display();
		
		//to display all department in the list
		System.out.println("\nGetting all department with list\n");
		deptservice.getAllDepartments();
		//deptservice.display();
	
		//display employees according to the list
		deptservice.getAllEmployees(102);
		deptservice.display();
		
		
		
	}

}
