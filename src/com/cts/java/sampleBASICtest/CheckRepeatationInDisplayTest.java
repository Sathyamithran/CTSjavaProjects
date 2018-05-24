package com.cts.java.sampleBASICtest;

import com.cts.java.sampleBASIC.CheckRepeatationInDisplay;

public class CheckRepeatationInDisplayTest 
{
	public static void main(String[] args) 
	{
		CheckRepeatationInDisplay crid = new CheckRepeatationInDisplay();
		
		String word="Hello World";
		String word1[]= word.split("");
		String check[]=crid.checkRepeatationDisplay(word);
		
		for(int i=0;i<word1.length;i++)
		{
			System.out.println(word1[i]+"....."+check[i]);
		}
	}

}
