package com.cts.java.sample_basic;

public class CountLetterInWord 
{
	public Integer startCountingLetter(String word)
	{
		int count=0;
		String wordarr[]=word.split("");
		for(int i=0;i<word.length();i++)
		{
			count+=1;
		}
		return count;
	}

}
