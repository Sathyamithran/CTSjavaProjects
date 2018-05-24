package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.PrimeBetwRange;

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
