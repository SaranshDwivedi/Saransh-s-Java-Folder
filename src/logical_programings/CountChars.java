package logical_programings;

import java.util.HashSet;

class CountChars
{
	public static void main(String [] args)
	{
		String str = "saranshdwivedi";

		char [] c = str.toCharArray();

		HashSet hs = new HashSet();

		for(int i = 0; i < str.length()-1; i++)
		{
			hs.add(c[i]);
		}		
		System.out.println(hs);

		for(char c1 : c)
		{
			int count = 0;

			for(int i = 0; i < c.length-1 ; i++)
			{
				if(c1 == c[i])
				{
					count++;
				}
			}
		System.out.println(c1+ " " +count);
		}
	}
}