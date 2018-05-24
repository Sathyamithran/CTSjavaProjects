package com.cts.java.sampleBASICtest;

import java.util.Scanner;

import com.cts.java.sampleBASIC.GradeInSwitch;

public class GradeInSwitchTest 
{
	public static void main(String args[])
	{
		GradeInSwitch gis = new GradeInSwitch();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int s1,s2,s3;
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		System.out.println(gis.getGrade(s1, s2, s3));
		
		
	}

}
