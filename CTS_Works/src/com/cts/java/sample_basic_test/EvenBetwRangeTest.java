package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.EvenBetwRange;

public class EvenBetwRangeTest 
{
	public static void main(String args[])
	{
		EvenBetwRange EvenBetwRange = new EvenBetwRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		EvenBetwRange.displayEven(a, b);
	}

}
