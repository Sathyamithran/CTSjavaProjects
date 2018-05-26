package com.cts.java.sample_basic_test;

import com.cts.java.sample_basic.FigureEight;

public class FigureEightTest 
{
	public static void main(String[] args) 
	{
		FigureEight eight = new FigureEight();
		
		eight.horizontalBars(4);
		System.out.println("");
		eight.verticalBars(4);
		eight.horizontalBars(4);
		System.out.println("");
		eight.verticalBars(4);
		eight.horizontalBars(4);
	}
}
