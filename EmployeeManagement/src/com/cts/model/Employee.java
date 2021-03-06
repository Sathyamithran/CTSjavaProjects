package com.cts.model;

public class Employee 
{

		
			private int id;
			private String name;
			public int salary;
			public int departmentId;
			
			//Constructors
			public Employee(int id, String name, int salary, int department) 
			{
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
				this.departmentId = department;
			}
			
			public Employee() {
				// TODO Auto-generated constructor stub
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
			public int getSalary() 
			{
				return salary;
			}
			public void setSalary(int salary) 
			{
				this.salary = salary;
			}
			public int getDepartment() {
				return departmentId;
			}

			public void setDepartment(int department) {
				this.departmentId = department;
			}


			public void displayEmpProp()
			{
				System.out.println(id);
				System.out.println(name);
				System.out.println(salary);
			}
			

			
}