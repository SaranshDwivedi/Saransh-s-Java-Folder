package PracticeLast;

public class SumationOfArray
{
	public static void main (String [] args)
	{
		int a [] = {1,2,3,45,5,66,4};
		
		int sum = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}
}