package PracticeLast;

public class ThirdMaxNumInArray {

	public static void main(String[] args) {

		int  a [] = {1,2,3,4,5,6};

		int m1 = a[0];

		int m2 = a[1];

		int m3 = a[2];

		for(int i = 3; i<a.length; i++)
		{
			if(a[i] > m1)
			{
				m3 = m2;
				m2 = m1;
				m1 = a[i];
			}
			else if(a[i] > m2)
			{
				m2 = m1;
				m1 = a[i];
			}
			else if(a[i] > m3)
			{
				m3 = a[i];
			}
		}
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}

}
