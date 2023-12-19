package Conditional_Operator;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in); 
		
		System.out.print("Enter Your Obtained Grades In Number Format : ");
		
		int a = s.nextInt();
		
		if(a > 80 && a < 100)
		{
			System.out.println("First Grade");
		}
		else if(a > 70 && a < 80)
		{
			System.out.println("Second Grade");
		}
		else if(a > 40 && a < 70)
		{
			System.out.println("Third Grade");
		}
		else
		{
			System.out.println("Failed Sucessfully");
		}
	}

}
