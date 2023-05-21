package logical_programings;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Desired String : ");

		String s = sc.nextLine();

		int length = s.length();

		String rev = "";

		for(int i = length - 1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
