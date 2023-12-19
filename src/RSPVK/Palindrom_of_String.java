package RSPVK;

public class Palindrom_of_String {

	public static void main(String[] args) {
		
		String s ="malayalam";
		
		String rev = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println(s+" is palindrom string of "+rev);
		}
		else
		{
			System.out.println(s+" is not a palindrom String of "+rev);
		}
	}

}
