package logical_Questions;

import java.util.Scanner; 

class Odd_Numbers_10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i<=10 ; i++)
		{
			if (c%2==0)
			{
				System.out.println(c);
			}
			else 
			{
				System.out.println("Even Number");
			}
			
		}
	}
}
