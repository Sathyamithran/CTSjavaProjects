package com.cts.java.sampleBASIC;

public class PrimeBetwRange 
{
	public void displayPrime(int start,int end)
	{
		PrimeOrNot pon1 = new PrimeOrNot();
		int i;
	
		for(i=start;i<end;i++)
		{
			if(pon1.checkPrime(i)==true)
			{
				System.out.println(i);
			}
		}
	}
}
