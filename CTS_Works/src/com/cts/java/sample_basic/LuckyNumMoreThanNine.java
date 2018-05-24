package com.cts.java.sample_basic;

public class LuckyNumMoreThanNine 
{
	public Integer getLucky(int num)
	{
		SumOfIndvInteger soii1= new SumOfIndvInteger();
		
		soii1.sumOfIndvInt(num);
		if(soii1.sumOfIndvInt(num)>10)
		{
			return getLucky(soii1.sumOfIndvInt(num)); 
			
		}
		else
		{
			return soii1.sumOfIndvInt(num);
		}
	}

}
