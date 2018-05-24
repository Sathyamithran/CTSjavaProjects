package com.cts.java.sample_oops;

public class ContractEmployee extends Employee
{
	private int duration;

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
		
	public void display() {	
		super.displayEmpProp();
		System.out.println(duration);
	}
	
	
	

}
