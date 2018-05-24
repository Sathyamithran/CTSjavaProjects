package com.cts.java.sampleBASICtest;

import java.util.Scanner;

import com.cts.java.sampleBASIC.PrimeBetwRange;

public class PrimeBetwRangeTest
{
	public static void main(String args[])
	{
		PrimeBetwRange pbr = new PrimeBetwRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range values: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		pbr.displayPrime(a, b);
	}
}
