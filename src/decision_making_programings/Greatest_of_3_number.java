package decision_making_programings;

import java.util.Scanner;

public class Greatest_of_3_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number : ");
		
		int a = sc.nextInt();
		
		System.out.print("Enter 2nd Number : ");
		
		int b = sc.nextInt();
		
		System.out.print("Enter 3rd Number : ");
		
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(a+" : 1st Number is Greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" : 2nd Number is Greatest");
		}
		else
		{
			System.out.println(c+" : 3rd Number is Greatest");
		}

	}

}
