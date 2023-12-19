package RSPVK;
import java.util.*;
public class Prime_number_in_Range {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("give valid inputs for a and b : ");
		int a = s.nextInt();
		int b = s.nextInt();
		for(int j = a; j <= b; j++)
		{
			int n = j;
			int count = 0;

			for(int i = 1; i <= n; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(n);
			}
		}
	}

}
