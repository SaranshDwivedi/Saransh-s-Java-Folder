package decision_making_programings;

import java.util.Scanner;

public class Odd_Even_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number : ");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+" is Even");
		}
		else
		{
			System.out.println(a+" is Odd");
		}
		

	}

}
