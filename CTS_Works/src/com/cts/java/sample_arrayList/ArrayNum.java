package com.cts.java.sample_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayNum 
{
	
	public void displayInArrayListWithEnhancedFor(List list)
	{
		for(Object obj: list)
		{
			System.out.println(obj);
		}
	}
	
	
	public void displayInArrayListWithIterator(List list)
	{
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	public void displayInArrayListWithFor(List list)
	{
		int size = list.size(); 
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
	
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i));;
		}
	
	}
	
	//search the integer in the array list
	public boolean searchNum(List<Integer> list, int key)
	{
		for(Integer integ:list)
		{
			if(integ==key)
			{
				return true;
			}
		}
		return false;
		
	}
	
	
	//search the string in the arraylist
	public boolean serachString(List<String> list,String key)
	{
		for(String a:list)
		{
			if(a.equals(key))
			{
				return true;
			
			}
		}
		return false;
	}
	
	
	//getting the position of the biggest
	//search the integer in the array list
	public int postion(List<Integer> list, int key)
	{
		int i=0;
		for(Integer integ:list)
		{
			i++;
			if(integ==key)
			{
				return i;
			}
		}
		return i;
		
	}
		
}
