package RSPVK;

public class Sum_of_digits_in_String {

	public static void main(String[] args) {

		String s = "Abcd123@98#lmn7";
		int sum = 0;

		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);

			if(c >= '0' && c <= '9')
			{
				int digit = c -'0';
				sum = digit + sum;
			}
		}
		System.out.println(sum);
	}
}
