package PracticeLast;

class UpperEach1stCharWord
{
	public static void main(String [] args)
	{
		String s = "trainer saransh dwivedi";
		
		char [] c = s.toCharArray();
	
		String es = "";

		c[0] = (char)(s.charAt(0)-32);

		for(int i = 0; i < c.length; i++)
		{
			if(c[i] == ' ')
			{
				c[i+1] = (char)(s.charAt(i+1)-32);
			}
		System.out.print(c[i]);
		}
		
	}
}