package com.cts.java.sample_basic_test;

import java.util.Arrays;

import com.cts.java.sample_basic.NaturalNumDisplayBetwRange;

public class NaturalNumDisplayBetwRangeTest 
{
	public static void main(String[] args) 
	{
		NaturalNumDisplayBetwRange nndb = new NaturalNumDisplayBetwRange();
		
		System.out.println(Arrays.toString(nndb.display(100, 150)));
		
	}

}
