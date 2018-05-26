package com.cts.java.sample_basic;

public class FigureEight 
{
	public void verticalBars(int size)
	{
		for(int i=0; i<size; i++)
		{
			System.out.print("|");
			for(int j=0;j<size+2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("|\n");
		}
	}
	
	public void horizontalBars(int size)
	{
		for(int i=0; i<size*2;i++)
		{
			System.out.print("-");
		}
	}

}
