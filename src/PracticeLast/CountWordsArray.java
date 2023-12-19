package PracticeLast;

public class CountWordsArray {

	public static void main(String[] args) {
		
		String s = "saransh s m dwivedi";
		
		int words = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(i==0 && s.charAt(i)!=' ')
			{
				words++;
			}
			else if(i<=s.length()-1 && s.charAt(i)!=' ' && s.charAt(i-1)==' ')
			{
				words++;
			}
		}
		System.out.println("Words in the Given Strings are : "+words);
	}

}
