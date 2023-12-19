package PracticeLast;

class MergeTwoArray
{
	public static void main(String [] args)
	{
		int a [] = {1,2,3,4};	

		int b [] = {4,4,5,7};

		int c [] = new int[a.length + b.length];

		int j = 0;

		for(int i = 0; i < c.length; i++)
		{
			if(i < a.length)
			{
				c[i] = a[i];
			}
			else
			{	
				c[i] = b[j];
				j++;
			}

			System.out.println(c[i]);

		}
	}
}