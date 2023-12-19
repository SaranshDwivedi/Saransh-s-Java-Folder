package RoughSheet;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		
		String s = "123sae@#$";
		
		int sum = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='1' && s.charAt(i)<='9')
			{
				int digit = s.charAt(i)-'0';
				
				sum = sum + digit;
			}
		}
		System.out.println(sum);

	}

}
