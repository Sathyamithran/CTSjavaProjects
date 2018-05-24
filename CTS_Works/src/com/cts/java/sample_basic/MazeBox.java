package com.cts.java.sample_basic;

public class MazeBox 
{
	public void displayMazeBox(int size)
	{
		System.out.print(" ");
		for(int i=1;i<=size*2;i++)
		{
			System.out.print("_");
		}
		for(int i=0;i<=size+1;i++)
		{
			System.out.println("");
			System.out.print("|");
			for(int j=1;j<=size*2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("|");
		
		}
		System.out.println("");	
		System.out.print(" ");
		for(int i=1;i<=size*2;i++)
		{
			System.out.print("_");
		}
	}

}
