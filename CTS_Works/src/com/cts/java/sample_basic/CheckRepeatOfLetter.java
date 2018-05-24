package com.cts.java.sample_basic;

public class CheckRepeatOfLetter 
{
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
