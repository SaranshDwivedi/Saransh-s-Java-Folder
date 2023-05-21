package logical_Questions;

import java.util.Scanner;

class Prime_or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int count=0;
		{
			for (int i =2; i<c ;i++ )
			{
				if (c%2==0)
				{
					count++;
				}
				if (count==0)
				{
					System.out.println("Prime");
					
				}
				else
				{
					System.out.println("Not Prime");
				}
				break;
			}
	}
 }
}
