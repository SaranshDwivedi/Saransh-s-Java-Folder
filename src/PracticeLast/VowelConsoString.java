package PracticeLast;

class VowelConsoString
{
	public static void main(String [] args)
	{
		String s = "apple";

		int V = 0;

		int C = 0;

		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				if(s.charAt(i) == 'a'|| s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
				{
					V++;
				}
				else
				{
					C++;
				}
			}
		}
		System.out.println(V);
		System.out.println(C);
	}
}