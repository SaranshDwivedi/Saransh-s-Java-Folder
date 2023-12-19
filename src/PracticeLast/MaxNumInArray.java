package PracticeLast;

public class MaxNumInArray {

	public static void main(String[] args) {
		
		int a [] = {11,3,33,44,99};
		
		int m1 = a[0];

		for(int i = 1; i<a.length; i++)
		{
			if(a[i] > m1)
			{
				m1 = a[i];
			}
		}
		System.out.println(m1);
	}

}
