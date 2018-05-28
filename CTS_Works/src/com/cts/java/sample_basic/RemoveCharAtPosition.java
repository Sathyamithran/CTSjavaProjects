package com.cts.java.sample_basic;

public class RemoveCharAtPosition 
{
	public String removeChar(String sentance,int position)
	{
		char[] charsentance = sentance.toCharArray(); 
		
		for(int i=position;i<charsentance.length-1;i++)
		{
			charsentance[i]=charsentance[i+1];
		}
		charsentance[charsentance.length-1]='\000';
		
		String sentance1 = new String(charsentance);
		
		return sentance1;
		
	}

}
