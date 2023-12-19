package PracticeLast;

import java.util.Scanner;

public class ConsonantCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		
		int Vcount = 0;
		
		int Ccount = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i')
				{
					Vcount++;
				}
				else
				{
					Ccount++;
				}
			}
			
		}
		System.out.println("Vowels count is : "+Vcount);
		System.out.println("Consonants count is : "+Ccount);
	}

}
