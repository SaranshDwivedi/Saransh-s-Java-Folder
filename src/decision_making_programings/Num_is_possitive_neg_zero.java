package decision_making_programings;

import java.util.Scanner;

public class Num_is_possitive_neg_zero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter desired Number : ");
		
		int a = sc.nextInt();
		
		if(a>0)
		{
			System.out.println(a+" is Positive");
		}
		else if(a<0)
		{
			System.out.println(a+" is Negetive");
		}
		else
		{
			System.out.println(a+" is Zero");
		}

	}

}
