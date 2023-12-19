
public class Palindrom_in_String {

	public static void main(String[] args) {
		
		String s = "aabaa";
		
		String rev = "";
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			char c = s.charAt(i);
			rev = c + rev;
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println(s+" is a Palindrom String");
		}
		else
		{
			System.out.println(s+" is NOT a Palindrom String");
		}
	}

}
