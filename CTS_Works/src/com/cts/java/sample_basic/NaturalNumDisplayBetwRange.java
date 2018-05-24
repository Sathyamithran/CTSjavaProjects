package com.cts.java.sample_basic;

import java.util.stream.IntStream;

public class NaturalNumDisplayBetwRange 
{
	public int[] display(int from, int to)
	{
		int[] number=new int[(to-from)+1];
		for(int i=from;i<=to;i++)
		{
			number[i-from]=i;
		}
		
		return number;
	}
	
}
