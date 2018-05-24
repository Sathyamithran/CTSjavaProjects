package com.cts.java.sampleBASIC;

public class NumberPalindrome 
{
	public Boolean isNumberPalindrome(int num)
	{
		
			int sum=0;
			while(num>0)
			{
				int temp =num%10;
				sum = sum*10 + temp;
				num = num/10;
			}
			return true;
		

	}

}
