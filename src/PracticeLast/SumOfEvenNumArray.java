package PracticeLast;

class SumOfEvenNumArray
{
	public static void main (String [] args)
	{
		int a [] = {1,2,4,5,65,7,7,8};

		int sum = 0;

		for(int i = 0; i < a.length; i++)
		{
			if(i%2==0)
			{
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}