package com.cts.java.sample_basic;

public class CountLowerCaseLetter 
{
	public Integer toCountLowerCase(String word)
	{
		int i = 0,count = 0;
		 
		for(i=0;i<word.length();i++)
		{
			char chara = word.charAt(i);
			if(Character.isLowerCase(chara))
			{
				count+=1;
			}
			else
			{
				count=count;
			}
		}
		
		return count;
	}

}
