package com.cts.java.sampleBASIC;

public class CountLetterInWord 
{
	//what you are couting??
	//what about white spaces?
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
