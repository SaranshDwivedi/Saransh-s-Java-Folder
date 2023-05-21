package logical_Questions;

import java.util.Scanner;

class Odd_Even
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
	    if (c%2==0)
	    {
			System.out.println("Even");
	    }
		else
		{
			System.out.println("Odd");
		}
	}
}
