
public class SpaceProcess 
{
	public int Space(String word)
	{
		int count = 0,i=0;
		char space[]= null;
		for(i=0;i<word.length();i++)
		{
			if(word.charAt(i)==' ')
			{
				return i;
			}
		}
		
		return 0;
	}

}
