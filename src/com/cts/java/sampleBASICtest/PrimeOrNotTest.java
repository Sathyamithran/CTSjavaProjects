package com.cts.java.sampleBASICtest;

import java.util.*;

import com.cts.java.sampleBASIC.PrimeOrNot;
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
