package RSPVK;

public class Second_max_in_Array {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7};
		
		int m1 = a[0];
		int m2 = a[1];
		
		for(int i = 2; i < a.length; i++)
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
		System.out.println("1st max : "+m1);
		System.out.println("2st max : "+m2);
	}

}
