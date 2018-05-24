package com.cts.java.sampleBASICtest;

import java.util.Scanner;

import com.cts.java.sampleBASIC.EvenBetwRange;

public class EvenBetwRangeTest 
{
	public static void main(String args[])
	{
		EvenBetwRange ebr = new EvenBetwRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ebr.displayEven(a, b);
	}

}
