package com.cts.java.sampleBASIC;

public class CheckRepeatOfLetter 
{
	//this will not work.  The method return type is String and you are returning integer.
	public String checkRepeatation(String word,String alpha)
	{
				
		int count = 0;
		for(int i=0;i<word.length();i++) 
		{
			if(word.charAt(i) == alpha.charAt(0))
			{
				count+=1;
			}
			
		}
		return Integer.toString(count);
	}

}
