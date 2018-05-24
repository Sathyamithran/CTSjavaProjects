package com.cts.java.sample_oops;

public class Employee 
{
	
		private int id;
		private String name;
		private double salary;

/*		
		//Constructors
		public Employee(int id, String name, double salary) 
		{
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		
		
*/		
		
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
		
		
		
		//Constructor
		//public Employee(int id)
		{
	//		this.id = id;
		}
		
		//equals mechanism
		public boolean equals(Object obj)
		{
			if(this ==obj)
				return true;
			if(obj == null)
				return false;
			if(getClass() != obj.getClass())
				return false;
			Employee others = (Employee) obj;
			if(name == null)
			{
				if(others.name != null)
				{
					return false;
				}
			}
			else if(!name.equals(others.name))
				return false;
			if(salary != others.salary)
				return false;
			
			return true;
			
		}

		//Address class
		private Address adrs;

		
		//getter and setters for Address class
		public Address getAdrs() {
			return adrs;
		}
		public void setAdrs(Address adrs) {
			this.adrs = adrs;
		
		}
		
		
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adrs=" + adrs + "]";
		}

		

}

/*
hashmap 
it is the short is the method in the path of the followed 
there may be collision when same 
	collision resolution techniques
		-----open hashing
		-----chaining
		
		
		folding , prime number, 
		
		we cant say 
		

*/