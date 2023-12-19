package PracticeLast;

class AddNumString
{
	public static void main(String [] args)
	{
		String s = "123asdASD@#$4";

		char [] c = s.toCharArray();

		int sum = 0;

		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= '1' && s.charAt(i) <= '9')
			{
				sum = sum + (s.charAt(i)-'0');
			}
		}
		System.out.println(sum);
	}
}