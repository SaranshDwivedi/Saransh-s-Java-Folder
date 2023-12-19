package PracticeLast;

public class FirstCharUpperSring {

	public static void main(String [] args)
	{
		String s = "saransh dwivedi";
		
		char c [] = s.toCharArray();
		
		c[0] = (char)(c[0]-32);
				
		for(int i = 0; i<c.length; i++)
		{
			if(c[i] == ' ')
			{ 
				c[i+1] = (char)(c[i+1]-32);
			}
		}
		System.out.println(c);
	}
}
