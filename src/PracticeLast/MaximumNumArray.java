package PracticeLast;

class MaximumNumArray
{
	public static void main (String [] args)
	{
		int [] a = {1,2,3,4,5,67,7,8};

		int m = a[0];

		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > m)
			{
				m = a[i];
			}
		}
		System.out.println(m);
	}
}