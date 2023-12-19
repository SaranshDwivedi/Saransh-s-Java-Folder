
public class Captilize_all_first_char_of_each_word {

	public static void main(String[] args) {
		
		String s = "richest man alive on earth saransh dwivedi";
		
		char c [] = s.toCharArray();
		
		c[0] = (char)(c[0]-32);
		
		for(int i = 0 ; i < c.length; i++)
		{
			if(c[i] == ' ')
			{
				c[i+1] = (char)(c[i+1]-32);
			}
		}
		System.out.println(c);
	}

}
