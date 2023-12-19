package RSPVK;

public class Palindrom_of_number {

	public static void main(String[] args) {

		int num = 123;
		int copy = num;
		int rev = 0;
		
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev*10 + rem;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(rev == copy)
		{
			System.out.println(copy+" is a palindrom number.");
		}
		else
		{
			System.out.println(copy+" is not a palindrom number.");
		}
	}

}
