package com.cts.java.sample_oops;

public class Address extends Employee 
{
	private String street = "Anna Nagar";
	private String city = "Chennai";
	private int pincode = 600028;
	
	
	
	//getter and setters
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	public void displayAddress()
	{
		super.displayEmpProp();
		System.out.println(street);
		System.out.println(city);
		System.out.println(pincode);
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
	

}
