package looping_logicals_programings;

import java.util.Scanner;

public class Tables_upto_10_place {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the desired number's Table you want : ");
		
		int a = sc.nextInt();
		
		System.out.println("by FOR loop");
		
		for(int i = 1; i<=10 ; i++)
		{
			System.out.println(a+" X "+i+" = "+a*i);
		}

		System.out.println("by WHILE loop");
		
		int i = 1;
		while(i<=10)
		{
			System.out.println(a+" X "+i+" = "+a*i);
			i++;
		}
		
		System.out.println("by DO WHILE loop");
		
		int j = 1;
		do
		{
			System.out.println(a+" X "+j+" = "+a*j);
			j++;
		}
		while(j<=10);
	}

}