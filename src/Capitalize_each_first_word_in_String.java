
public class Capitalize_each_first_word_in_String {

	public static void main(String[] args) {

		String s = "multi billinior alive man on earth saransh dwivedi";

		char c [] = s.toCharArray();

		c[0] = (char)(c[0] - 32);

		for(int i = 0; i < s.length(); i++)
		{
			if(c[i] == ' ')
			{
				c[i+1] = (char)(c[i+1] - 32);
			}
			System.out.print(c[i]);
		}
	}
}