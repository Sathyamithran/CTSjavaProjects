package com.cts.java.sampleBASIC;

public class GradeInSwitch 
{
	public String getGrade(int sub1,int sub2, int sub3)
	{
		int avg= (sub1+sub2+sub3)/3;
		int res =  (int) (avg*0.1);
		switch(res)
		{
			case 10: return "A+";
			case 9:	return "A+";
			case 8:	return "A";
			case 7: return "A-";
			case 6: return "B+";
			default: return "U";
			
		}
	}
}
