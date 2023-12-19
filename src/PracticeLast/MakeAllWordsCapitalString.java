package PracticeLast;

public class MakeAllWordsCapitalString 
{
	public static void main(String [] args)
	{
		String s = " java trainer saransh dwivedi";
		
		char c [] = s.toCharArray();
		
		for(int i = 0; i<c.length; i++)
		{
			if(c[i] == ' ')
			{
				continue;
			}
			else
			{
				c[i] = (char)(c[i]-32);
			}
		}
		System.out.println(c);
	}
}
