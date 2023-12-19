package PracticeLast;

public class ReverseOfElementOfArray {

	public static void main(String[] args) {

		int a [] = {12,21,32,44,45,446,76};
		
		
		
		for(int i = 0; i<a.length; i++)
		{
			int rev  = 0;
			
			int num = a[i];
			
			while(num>0)
			{
				int rem = num%10;
				
				rev = rev*10 + rem;
				
				num = num/10;
			}
			System.out.println(rev);
			
		}
		}
		

}
