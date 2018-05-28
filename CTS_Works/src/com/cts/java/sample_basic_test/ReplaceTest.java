package com.cts.java.sample_basic_test;

import com.cts.java.sample_basic.Replace;

public class ReplaceTest 
{

	public static void main(String[] args) 
	{
		Replace replace = new Replace();
		
		System.out.print(replace.toReplace("$ Sathyamithran $"," ", ""));
		
	}
}
