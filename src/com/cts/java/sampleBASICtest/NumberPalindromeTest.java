package com.cts.java.sampleBASICtest;

import com.cts.java.sampleBASIC.NumberPalindrome;

public class NumberPalindromeTest 
{
	public static void main(String args[])
	{
		NumberPalindrome np = new NumberPalindrome();
		int n=12321;
		System.out.println(np.isNumberPalindrome(n));
	}

}
