package RoughSheet;

// Palindrom String = when Original String is Similar to the reverse of the Original String

public class PalindromString {

	public static void main(String[] args) {
		
		String s = "saransh";
		
		String copy = s;
		
		String es = "";
		
		for(int i = s.length() - 1; i >= 0 ; i--)
		{
			es = es + s.charAt(i);
		}
		System.out.println(es);
		
		if(es.equals(copy))
		{
			System.out.println(copy+" is Palindrom String");
		}
		else
		{
			System.out.println(copy+" is not Palindrom String");
		}
	}

}
