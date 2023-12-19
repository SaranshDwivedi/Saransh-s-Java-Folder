package PracticeLast;

public class LinearSearchARRAY {

	public static void main(String[] args) {
		
		int a [] = {1,2,4,5,67,7,8,0};
		
		int el = 0;
		
		for(int i = 0 ; i<a.length ; i++)
		{
			if(el == a[i])
			{
				System.out.println(i);
			}
		}
		
	}

}
