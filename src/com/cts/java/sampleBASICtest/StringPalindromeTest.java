package com.cts.java.sampleBASICtest;

import java.util.Scanner;

import com.cts.java.sampleBASIC.StringPalindrome;

public class StringPalindromeTest 
{
	public static void main(String args[])
	{
		StringPalindrome sp = new StringPalindrome();
		String str="HELLO";
		System.out.println(sp.isStringPalindrome(str));
	}

}
