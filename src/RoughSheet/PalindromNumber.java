package RoughSheet;

// Palindrom Number = number which is same when we do is in reverse

public class PalindromNumber {

	public static void main(String[] args) {
		
		int num = 121;
		
		int sum = 0;
		
		int copy = num;
		
		while(num>0)
		{
			int rem = num % 10;
			
			sum = sum*10 + rem;
			
			num = num / 10;
		}
		if(copy == sum)
		{
			System.out.println(copy+" is a Palindrom number");
		}
		else
		{
			System.out.println(copy+" is not a Palindrom Number");
		}

	}

}
