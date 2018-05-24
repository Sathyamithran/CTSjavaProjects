package com.cts.java.sample_basic_test;

import com.cts.java.sample_basic.NumberPalindrome;

public class NumberPalindromeTest 
{
	public static void main(String args[])
	{
		NumberPalindrome np = new NumberPalindrome();
		int n=12321;
		System.out.println(np.isNumberPalindrome(n));
	}

}
