package looping_logicals_programings;

import java.util.Scanner;

public class Passing_string_10_times {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Desired Word To Print 10 Times : ");
		
		String s = sc.nextLine();
		
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println(s);
//		}

		int i = 1;
		do
		{
			System.out.println(s);
			i++;
		}
		while(i<=10);
	}

}
