package com.cts.java.sampleBASIC;

import javafx.util.Pair;

public class SwapingWithoutTemp 
{
	public int toSwap(int first,int second)
	{
		
		first=first+second;
		second=first-second;
		first=first-second;
		
		return toSwap(first,second);
	}

}
