import com.cts.model.Department;
import com.cts.service.DepartmentService;
import com.cts.service.Impl.DepartmentServiceImpl;

public class DepartmentTest 
{
	public static void main(String[] args) 
	{
		DepartmentService deptservice = new DepartmentServiceImpl();
		
		//Creating the departments
		Department employee1 = new Department(101,"Mechanical");
		Department employee2 = new Department(102,"Computer Science");
		
		//display before adding employee
		System.out.println("\nBefore adding the records\n");
		deptservice.display();
		
		//adding Department to the list
		
		
		
		
	}

}
