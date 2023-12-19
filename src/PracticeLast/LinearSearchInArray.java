package PracticeLast;

class LinearSearchInArray
{
	public static void main (String [] args)
	{
		int [] a = {1,2,4,5,6,7,8,9};

		int ele = 8;

		for(int i = 0; i < a.length; i++)
		{
			if(ele == a[i])
			{
				System.out.println(i);
			}
		}
	}
}