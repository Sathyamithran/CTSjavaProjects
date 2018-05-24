package com.cts.java.sampleBASICtest;

import java.util.Scanner;

import com.cts.java.sampleBASIC.SumOfNumbers;

public class SumOfNumbersTest 
{
	public static void main(String[] args) 
	{

		int a[]= {1,2,3,4,5,6,7,8,9,0};
		SumOfNumbers son = new SumOfNumbers();
		System.out.println(son.addNumber(a));
		
	}

}
