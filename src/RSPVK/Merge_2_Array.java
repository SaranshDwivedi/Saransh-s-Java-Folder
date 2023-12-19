package RSPVK;

public class Merge_2_Array {

	public static void main(String[] args) {

		int a [] = {1,2,3};
		int b [] = {4,5,6};

		int c [] = new int [a.length + b.length];

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
			System.out.print(c[i]);
		}
	}
}
