package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.TranslateNumtoWord;

public class TranslateNumtoWordTest 
{
	public static void main(String[] args) 
	{
		TranslateNumtoWord tnw = new TranslateNumtoWord();
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the Number to translate: ");//for testing purpose
		
		//int n=sc.nextInt();
		System.out.println(tnw.displayTranslate(4578));
	}
}
