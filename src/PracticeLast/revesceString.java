package PracticeLast;

public class revesceString {
	public static void main(String[] args) {
		
		String s = "abcd";
		
		String rev = "";
		
		for(int i =0; i<s.length(); i++)
		{
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}