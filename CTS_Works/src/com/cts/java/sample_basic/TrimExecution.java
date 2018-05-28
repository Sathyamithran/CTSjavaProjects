package com.cts.java.sample_basic;

public class TrimExecution 
{
	public String toTrim(String sentance)
	{
		char sentance1[]=sentance.toCharArray();
		
		for(int i=0;i<sentance1.length;i++)
		{
			if(sentance.charAt(i)==' ')
			{
				sentance1[i]=sentance1[i+1];
				
			}
				
		}
		sentance1[sentance1.length-1] = '\000';
		/*
		for(int j=sentance.length();j>sentance.length();j--)
		{
			if(sentance.charAt(j)==' ')
			{
				sentance1[j]= (Character) null;
			}
		
		}
		*/
		String sentancenew = new String(sentance1);
				
		return sentancenew;
	}

}
