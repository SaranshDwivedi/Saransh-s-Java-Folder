
public class Capitslize_every_char_in_String {

	public static void main(String[] args) {
		
		String s = "saransh dwivedi";
		
		char c [] = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++)
		{
			c[i] = (char)(c[i] - 32);
			System.out.print(c[i]);
		}
	}
}
