package RSPVK;
import java.util.*;
public class Reverse_of_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Give me a valid number : ");
		int num = s.nextInt();
		int copy = num;
		int rev = 0;
		
		while(num != 0)
		{
			int rem = num % 10;
			rev = rev*10 +rem;
			num = num / 10;
		}
		System.out.println("reverse of "+copy+" is "+rev);
	}

}
