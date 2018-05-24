package com.cts.java.sample_basic;

public class SumOfNumbers 
{
	public Integer addNumber(int num[])
	{
		
		int res=0;
		for(int i=0;i<num.length;i++)
		{
			res=+num[i];
		
		}
		System.out.println(num.length);
		return res;
	}
}
