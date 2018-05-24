package com.cts.java.sample_basic;

public class CountWordInSentance 
{
	public Integer startCountingWord(String sentence)
	{
		int count = 0;
		String[] sentencearr = sentence.split(" ");
		
		for(int i=0;i<sentencearr.length;i++)
		{
			count+=1;
		}
		return count;
	}
	

}
