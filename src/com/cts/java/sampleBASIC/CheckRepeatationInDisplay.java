package com.cts.java.sampleBASIC;

public class CheckRepeatationInDisplay 
{
	//it should not return string[]
	public String[] checkRepeatationDisplay(String word)
	{
		CheckRepeatOfLetter crol1 = new CheckRepeatOfLetter();
		//why two string array??
		String collab[] = word.split("");
		String collab1[] = new String[collab.length];
		for(int i=0;i<(word.length());i++)
		{
			collab1[i]=crol1.checkRepeatation(word, collab[i]);
		}
		return collab1;
	}
}
