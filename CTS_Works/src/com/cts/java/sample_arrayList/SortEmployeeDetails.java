package com.cts.java.sample_arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeDetails implements Comparable<Employee>,Comparator<Employee>
{
	public boolean save(Employee emp)
	{
		if()
		return false;
		
	}
	
	public Employee get(int id)
	{
		for(Employee emp: emplList)
		{
			if(emp.getId() == id)
			{
				return emp;
			}
		}
	}
	public static void main(String[] args) 
	{
		Employee emp;	//creating the instance of Employee class
		
		//create the list
		List emplList = new ArrayList();
		
		
		//passing the values to the list
		emp = new Employee(12,"sam",12000);
			
	}

/*	
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

*/
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.salary - o2.salary;
	}

	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}