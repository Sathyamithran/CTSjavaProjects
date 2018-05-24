package com.cts.model;

public class Employee 
{

		
			private int id;
			private String name;
			public double salary;
			
			//Constructors
			public Employee(int id, String name, double salary) 
			{
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
			}
			
			//getters and setters
			public int getId() 
			{
				return id;
			}
			public void setId(int id) 
			{
				this.id = id;
			}
			public String getName() 
			{
				return name;
			}
			public void setName(String name) 
			{
				this.name = name;
			}
			public double getSalary() 
			{
				return salary;
			}
			public void setSalary(double salary) 
			{
				this.salary = salary;
			}

			public void displayEmpProp()
			{
				System.out.println(id);
				System.out.println(name);
				System.out.println(salary);
			}
			

			
}