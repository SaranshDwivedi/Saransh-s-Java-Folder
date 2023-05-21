package decision_making_programings;

import java.util.Scanner;

public class Possitive_Negetive_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number : ");
		
		int i = sc.nextInt();
		
		if(i>0)
		{
			System.out.println(i+" is positive");
		}
		else
		{
			System.out.println(i+" is Negetive");
		}

	}

}
