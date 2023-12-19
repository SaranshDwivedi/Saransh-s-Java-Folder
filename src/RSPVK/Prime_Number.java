package RSPVK;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Give me a valid number : ");
		int a = s.nextInt();

		int count = 0;

		for(int i = 1; i <= a; i++)
		{
			if(a % i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(a+" is a Prime Number.");
		}
		else
		{
			System.out.println(a+" is not a prime number.");
		}
	}

}
