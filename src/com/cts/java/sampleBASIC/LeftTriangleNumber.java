package com.cts.java.sampleBASIC;

public class LeftTriangleNumber 
{
	public void dispalyLeftTriangle(int size)
	{
		for(int k=1;k<=size;k++)
		{
			for(int i=1;i<=size-k;i++)
			{
				System.out.print(" ");
			}
			
			for(int s=1;s<=k;s++)
			{
				System.out.print(s);
			}
			System.out.println("");
		}
	}

}
