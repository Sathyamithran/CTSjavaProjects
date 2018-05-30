


import com.cts.db.impl.DBConnection;
public class EmployeeDBServiceTest 
{
	public static void main(String[] args) 
	{
		
		if(DBConnection.getConnection()!=null)
		{
			System.out.println("Connection established");
			
		}
	}
	

}
