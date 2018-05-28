package com.cts.java.sample_basic;

import java.util.Arrays;

public class Replace 
{
	public String toReplace(String word,String characterplace ,String key)
	{
		
		String wordString[] = {};
		for(int i=0;i<word.length()-1;i++)
		{
			if(wordString[i]==characterplace)
			{
				wordString[i]="\000";
			}
		}
		return wordString.toString();
	}

}

