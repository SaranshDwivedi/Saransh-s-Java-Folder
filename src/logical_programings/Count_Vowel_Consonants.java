package logical_programings;
import java.util.Scanner;

public class Count_Vowel_Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
				
		
		int vowcount = 0;
		
		int concount = 0;
		
		for(int i = 0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'a'|| ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u')
			{
				vowcount++;
			}
			else
			{
				concount++;
			}
		
			
		}
		System.out.println(vowcount);
		
		
		System.out.println(concount);
		
		
	}

}

