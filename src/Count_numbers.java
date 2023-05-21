import java.util.Scanner;

public class Count_numbers {		//count characters
 

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Those Words : ");
		String s = sc.nextLine();
				
		
		int count = 0;
		
		for(int i = 0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			{
				count++;
			}
					
		}
		System.out.println(count);		
	}
	}