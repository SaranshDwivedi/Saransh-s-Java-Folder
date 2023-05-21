package decision_making_programings;

import java.util.Scanner;

public class Greatest_of_2_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");

		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is Greater");
		}
		else
		{
			System.out.println(b+" is Greater");
		}
	}

}
