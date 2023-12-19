
public class Sumation_of_digits_String 
{
	public static void main(String[] args) {
		
		String s = "abcD@12345";
		
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c >= '0' && c <= '9')
			{
				int digit = c -'0';
				sum = sum + digit;
			}
		}
		System.out.println(sum);
	}
}
