package com.cts.java.sampleBASICtest;

import java.util.Arrays;

import com.cts.java.sampleBASIC.NaturalNumDisplayBetwRange;

public class NaturalNumDisplayBetwRangeTest 
{
	public static void main(String[] args) 
	{
		NaturalNumDisplayBetwRange nndb = new NaturalNumDisplayBetwRange();
		
		System.out.println(Arrays.toString(nndb.display(100, 150)));
		
	}

}
