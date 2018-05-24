package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.StringPalindrome;

public class StringPalindromeTest 
{
	public static void main(String args[])
	{
		StringPalindrome sp = new StringPalindrome();
		String str="HELLO";
		System.out.println(sp.isStringPalindrome(str));
	}

}
