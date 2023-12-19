package PracticeLast;

class LowerToUpperOddIndex
{
	public static void main (String [] args)
	{
		String s = "saransh";

		String es = "";

		for(int i = 0; i < s.length(); i++)
		{
			if(i%2==0)
			{
				es = es + (char)(s.charAt(i));
			}
			else
			{
				es = es + (char)(s.charAt(i)-32);
			}
		}
		System.out.println(es);
	}
}