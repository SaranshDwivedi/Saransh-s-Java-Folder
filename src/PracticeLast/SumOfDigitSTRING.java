package PracticeLast;

public class SumOfDigitSTRING {

	public static void main(String[] args) {

		String s = "asbd123&fg";

		int sum = 0;

		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int dig = s.charAt(i) - '0';

				sum = sum + dig;
			}
		}
		System.out.println(sum);
	}

}
