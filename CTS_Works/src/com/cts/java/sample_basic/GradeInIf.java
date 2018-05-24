package com.cts.java.sample_basic;

public class GradeInIf 
{
	public String getGrade(int sub1,int sub2, int sub3)
	{
		int avg= (sub1+sub2+sub3)/3;
		
		if(avg >= 90)
		{
			return "A+";
		}
		else if((avg>=80)&&(avg<=89))
		{
			return "A";
		}
		else if((avg>=70)&&(avg<=79))
		{
			return "A-";
		}
		else if((avg>=60)&&(avg<=69))
		{
			return "B+";
		}
		else if((avg>=50)&&(avg<=59))
		{
			return "B";
		}
		else
		{
			return "U";
		}
		
		
	}

}
