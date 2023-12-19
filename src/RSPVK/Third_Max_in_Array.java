package RSPVK;

public class Third_Max_in_Array {

	public static void main(String[] args) {

		int a [] = {1,2,3,4,5,6,8,9};

		int m1 = a[0];
		int m2 = a[1];
		int m3 = a[2];

		for(int i = 3; i < a.length; i++)
		{
			if(a[i] > m1)
			{
				m3 = m2;
				m2 = m1;
				m1 = a[i];
			}
			else if(a[i] > m2)
			{
				m3 = m2;
				m2 = a[i];
			}
			else if(a[i] > m3)
			{
				m3 = a[i];
			}
		}
		System.out.println("1st max : "+m1);
		System.out.println("2st max : "+m2);
		System.out.println("3st max : "+m3);
	}

}
