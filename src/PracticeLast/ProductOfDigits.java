package PracticeLast;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		int num = 1234;
		
		int prod = 1;
		
		while(num > 0)
		{
			int rem = num % 10;
			
			prod = prod * rem;
		}
		System.out.println(prod);

	}

}
