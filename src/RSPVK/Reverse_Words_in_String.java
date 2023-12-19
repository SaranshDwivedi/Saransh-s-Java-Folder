package RSPVK;

public class Reverse_Words_in_String {

	public static void main(String[] args) {

		String s = "saransh dwivedi";
		String rev = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			rev = c + rev;
		}
		System.out.println(rev);
	}
}
