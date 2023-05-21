package logical_programings;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Desired Number : ");
		
		int num = sc.nextInt();
		
		int temp = num;
		
		int rev = 0, rem;
		
		while(temp != 0)
		{
			rem = temp%10;
			
			rev = rev*10 + rem;
			
			temp = temp/10;
		}

		if(num==rev)
		{
			System.out.println(num + " : is Palindrom");
		}
		else
		{
			System.out.println(num+ " : is not a palindrom");
		}
	}

}
