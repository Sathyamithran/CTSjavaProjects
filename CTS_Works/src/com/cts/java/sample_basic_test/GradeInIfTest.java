package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.GradeInIf;

public class GradeInIfTest 
{
	public static void main(String args[])
	{
		GradeInIf GradeInIf = new GradeInIf();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int s1,s2,s3;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		System.out.println(GradeInIf.getGrade(s1, s2, s3));
		
		
	}

}
