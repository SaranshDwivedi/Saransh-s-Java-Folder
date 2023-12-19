package PracticeLast;

public class SecondMaxNumInArray {

	public static void main(String[] args) {
		
		int a [] = {1,2,34,4,5,6,6,88};
		
		int m1 = a[0];
		
		int m2 = a[1];
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] > m1)
			{
				m2 = m1;
				m1 = a[i];
			}
			else if(a[i] > m2)
			{
				m2 = a[i];
			}
		}
		System.out.println(m1);
		System.out.println(m2);
	}

}
