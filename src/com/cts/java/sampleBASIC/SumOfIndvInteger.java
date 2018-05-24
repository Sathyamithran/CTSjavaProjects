package com.cts.java.sampleBASIC;

public class SumOfIndvInteger 
{
	public Integer sumOfIndvInt(int num)
	{
		int sum=0;
		while(num>0)
		{
			int temp =num%10;
			sum = sum + temp;
			num = num/10;
		}
		return sum;
	}

}
