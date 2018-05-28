package com.cts.java.sample_basic;

public class CheckMoreSpaces 
{
	public String CheckMoreSpace(String sentance)
	{
		
		String sentance1 = sentance + " ";
		int len = sentance1.length();
		String replace = "" ;
		RemoveCharAtPosition remove = new RemoveCharAtPosition();
		
		for(int i=0;i<len-1;i++)
		{
			if((sentance.charAt(i)==' ')&&(sentance.charAt(i+1)==' '))
			{
				replace = remove.removeChar(sentance1, i);
			}
		}

		return replace;
		
	}

}
