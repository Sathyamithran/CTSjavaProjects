package com.cts.java.sampleBASIC;

public class CountWordInSentance 
{
	public Integer startCountingWord(String sentence)
	{
		int count = 0;
		//why separate array??
		String[] sentencearr = sentence.split(" ");
		//what if they give more white spaces?
		for(int i=0;i<sentencearr.length;i++)
		{
			count+=1;
		}
		return count;
	}
	

}
