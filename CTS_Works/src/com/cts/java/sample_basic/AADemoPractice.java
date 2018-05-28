package com.cts.java.sample_basic;

public class AADemoPractice 
{
	
	RemoveCharAtPosition remove =new RemoveCharAtPosition();
	
	public String toGet(String data) 
	{
		String data1 = data + "$$$";
		String as ="";
		char[] charsentance = data.toCharArray();
		
		for(int i=0;i<data.length()-1;i++)
		{
			if((data.charAt(i)==' ')&&(data.charAt(i+1)==' ')||(data.charAt(i)==' ')&&(data.charAt(i+1)!=' '))
			{
				
				as += remove.removeChar(data, i);
				
			}
			if((data.charAt(i)!=' ')&&(data.charAt(i+1)==' '))
			{		
				as += remove.removeChar(data, i);
			}
		}
		
		for(int i=0;i<data1.length();i++)
		{
			if(data.charAt(i)=='$')
			{
				as+=remove.removeChar(data, i);				
				
			}
		}
		
		return as;
		
	}

}
