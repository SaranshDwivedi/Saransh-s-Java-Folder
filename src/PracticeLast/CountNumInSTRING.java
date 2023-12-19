package PracticeLast;

public class CountNumInSTRING {

	public static void main(String[] args) {

		String s = "ABC123@#$898aeiou";

		int words = 0;

		int cap = 0;

		int sml = 0;

		int num = 0;

		int spl = 0;

		int Lvow = 0;

		int Uvow = 0;

		for(int i = 0; i<=s.length()-1; i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				num++;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				cap++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				sml++;
			}
			
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
				{
					Lvow++;
				}
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					Uvow++;
				}
			}
			else
			{
				spl++;
			}
		}
		System.out.println("Capital Letters : "+cap);

		System.out.println("Small Letters : "+sml);

		System.out.println("Numbers : "+num);

		System.out.println("Special Charaters Letters : "+spl);

		System.out.println("Capital Letters Vowels : "+Uvow);

		System.out.println("Small Letters Vowels : "+Lvow);
	}

}
