package com.cts.java.sample_oops_test;

import com.cts.java.sample_oops.ContractEmployee;

public class ContractEmployeeTest 
{
	public static void main(String[] args) 
	{
		ContractEmployee ce = new ContractEmployee();
		
		ce.setDuration(7);
		ce.setId(132);
		ce.setName("king");
		ce.setSalary(23456);
		
		ce.display();
		
	}
}
