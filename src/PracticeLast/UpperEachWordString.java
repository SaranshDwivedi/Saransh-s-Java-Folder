package PracticeLast;

class UpperEachWordString
{
	public static void main (String [] args)
	{
		String s = "trainer saransh dwivedi";

		char [] c = s.toCharArray();

		String es = "";

		for(int i = 0; i<c.length; i++)
		{
			if(c[0]==' ')
			{
				continue;
			}
			else
			{
				c[i] = (char)(s.charAt(i)-32);
			}
			System.out.print(c[i]);
		}
		/*for(int j = 0; j < c.length; j++)
		{
			System.out.print(c[j]);
		}*/
	}
}