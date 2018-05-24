package com.cts.java.sample_basic;

import java.util.Scanner;

public class BiggestOfNumbers 
{
	public Integer isBiggest(int num)
	{
		Scanner sc = new Scanner(System.in); 
		int max = 0;
		int i;
		int numarr[] = new int[num];
		System.out.println("Enter the integers: ");
		for(i=0;i<num;i++)
		{
			numarr[i]=sc.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(max < numarr[i])
			{
				max = numarr[i];
			}
		}
		
		return max;
	}

}
