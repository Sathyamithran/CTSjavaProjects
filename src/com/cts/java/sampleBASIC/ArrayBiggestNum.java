//package name should not consist of capital letters.
package com.cts.java.sampleBASIC;

public class ArrayBiggestNum 
{
	
	//isXXXX method is used when it returns true or false.
	//when you want to get/return you have to use getXXX
	//like getBigestNumber
	public Integer isBigInArray(int array[])
	{
		// max should intialized with array[0]
		//if you use max=0, if all numbers in the array are -ve values, 
		//it will return 0
		int max = 0;
		int arraylen=array.length;
		for(int i=0;i<arraylen;i++)
		{
			if(max < array[i])
			{
				max=array[i];
			}
		}
		return max;
	}

}
