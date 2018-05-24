package com.cts.java.sample_basic_test;

import java.util.Scanner;

import com.cts.java.sample_basic.GradeInSwitch;

public class GradeInSwitchTest 
{
	public static void main(String args[])
	{
		GradeInSwitch GradeInSwitch = new GradeInSwitch();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int s1,s2,s3;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		System.out.println(GradeInSwitch.getGrade(s1, s2, s3));
		
		
	}

}
