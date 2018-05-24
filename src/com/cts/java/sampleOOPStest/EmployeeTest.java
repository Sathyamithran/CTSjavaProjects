package com.cts.java.sampleOOPStest;

import com.cts.java.sampleOOPS.Address;
import com.cts.java.sampleOOPS.ContractEmployee;
import com.cts.java.sampleOOPS.Employee;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee em;


		//Mandatory Field
		em = new Employee();
		em.setId(132);
		em.setName("king");
		em.setSalary(23456);
		//em.displayEmpProp();

		//getter Setter
		em.setId(123);
		em.setName("king");
		em.setSalary(23456);
		em.displayEmpProp();
		
		Employee em1 = new Employee();
		Employee em2 = em1;
		//System.out.println(em2.equals(em1));
		
		ContractEmployee ce1 = new ContractEmployee();
		
		ce1.setDuration(5);
		ce1.setId(132);
		ce1.setName("king");
		ce1.setSalary(23456);
		//ce1.display();
		
		///address extension
		Address adr = new Address();
		
		adr.setId(132);
		adr.setName("king");
		adr.setSalary(23456);
		
		Employee em4 = new Employee();
		em4.setAdrs(adr);
		
		System.out.println(em4.getAdrs());
		
	}

}
