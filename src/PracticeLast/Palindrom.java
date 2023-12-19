package PracticeLast;

public class Palindrom
{
	public static void main (String [] args)
	{
		int num = 1212;
		
		int rev = 0;
		
		int copy = num;
		
		while(num > 0)
		{
			int rem = num % 10;
			
			rev = rev * 10 + rem;
			
			num = num / 10;
		}
		System.out.println(rev);
		
		if(rev==copy)
		{
			System.out.println(copy+" : is a Palindrom number");
		}
		else
		{
			System.out.println(copy+" : is not a Palindrom number");
		}
	}
}