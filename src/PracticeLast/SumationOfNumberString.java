package PracticeLast;

public class SumationOfNumberString {

	public static void main(String[] args) {

		String s = "123asdASD$%^";

		int sum = 0 ;

		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int digit = s.charAt(i)-'0';

				sum = sum + digit;
			}
		}
		System.out.println(sum);
	}
}