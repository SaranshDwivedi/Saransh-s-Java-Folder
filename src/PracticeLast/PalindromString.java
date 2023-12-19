package PracticeLast;

class PalindromString
{
	public static void main (String [] args)
	{
		String s = "ababa";

		String es = "";

		//char [] c = s.toCharArray();

		for(int i = s.length()-1; i >= 0; i--)
		{
			es = es + s.charAt(i);
		}

		System.out.println(es);

		if(es.equals(s))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a Palindrom");
		}
	}
}