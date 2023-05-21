package decision_making_programings;

import java.util.Scanner;

public class Grades_of_student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Percentage : ");
		
		double a = sc.nextDouble();
		
		if(a>=75 && a<100)
		{
			System.out.println(a+ " comes under 1st Grade");
		}
		else if(a>=60 && a<75)
		{
			System.out.println(a+" comes under 2nd Grade");
		}
		else
		{
			System.out.println(a+ " comes under 3rd Grade");
		}

	}

}
