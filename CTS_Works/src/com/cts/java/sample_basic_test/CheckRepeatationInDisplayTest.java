package com.cts.java.sample_basic_test;

import com.cts.java.sample_basic.CheckRepeatationInDisplay;

public class CheckRepeatationInDisplayTest 
{
	public static void main(String[] args) 
	{
		CheckRepeatationInDisplay CheckRepeatationInDisplay = new CheckRepeatationInDisplay();
		
		String word="Hello World";
		String word1[]= word.split("");
		String check[]=CheckRepeatationInDisplay.checkRepeatationDisplay(word);
		
		for(int i=0;i<word1.length;i++)
		{
			System.out.println(word1[i]+"....."+check[i]);
		}
	}

}
