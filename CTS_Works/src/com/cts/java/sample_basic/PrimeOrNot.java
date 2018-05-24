package com.cts.java.sample_basic;

public class PrimeOrNot 
{
	public boolean checkPrime(int num)
	{
		int i,m=num/2;
		for(i=2;i<=m; i++)
		{
				if(num%i==0)
				{

					return false;
				}
				
		}
		return true;
	}
}
