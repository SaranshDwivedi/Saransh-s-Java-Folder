package PracticeLast;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int vcount = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				{
					vcount++;
				}
			}
		}
		System.out.println(vcount);
	}

}
