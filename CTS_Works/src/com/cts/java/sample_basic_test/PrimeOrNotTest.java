package com.cts.java.sample_basic_test;

import java.util.*;

import com.cts.java.sample_basic.PrimeOrNot;
public class PrimeOrNotTest 
{
	public static void main(String args[])
	{
		PrimeOrNot pon = new PrimeOrNot();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked: ");
		int num=sc.nextInt();
		System.out.println(pon.checkPrime(num));
	}

}
