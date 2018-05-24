package com.cts.java.sample_exception_handling;

public class ExceptionProcess 
{
	public static void main(String[] args) 
	{
		try 
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			
			int z = x/y;
			
			System.out.println(z);
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("enter only integer");
			//e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("enter both integers");
			//e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Dont use dinominator as Zero '0'");
			//e.printStackTrace();
		}
	}

}
