package RoughSheet;


/*Fibonacci Series = 0 1 1 2 3 5 8 13

					f = 0
					l = 1 	*/


public class FibonacciSeries {

	public static void main(String[] args) {
		
		int f = 0;
		
		int l = 1;
		
		int sum = 0;
		
		for(int i = 0; i <= 13; i++)
		{
			sum = f + l;
			
			f = l;
			l = sum;
		}
			System.out.println(sum);

	}

}
