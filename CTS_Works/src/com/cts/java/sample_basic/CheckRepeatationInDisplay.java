package com.cts.java.sample_basic;

public class CheckRepeatationInDisplay 
{
	public String[] checkRepeatationDisplay(String word)
	{
		CheckRepeatOfLetter crol1 = new CheckRepeatOfLetter();
		String collab[] = word.split("");
		String collab1[] = new String[collab.length];
		for(int i=0;i<(word.length());i++)
		{
			collab1[i]=crol1.checkRepeatation(word, collab[i]);
		}
		return collab1;
	}
}