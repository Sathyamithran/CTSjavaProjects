package com.cts.java.sampleBASIC;

public class EvenBetwRange 
{
	public void displayEven(int start,int end)
	{
		EvenOrNot eon1 = new EvenOrNot();
		int i;
		
		for(i=start;i<end;i++)
		{
			if(eon1.isEven(i)==true)
			{
				System.out.print(i);
				if(i<end)
				{
					System.out.print(",");
				}
			}

		}
		
	}

}
