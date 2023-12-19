
public class Capitalize_Even_index_chars_in_String 
{
	public static void main(String[] args)
	{
		String s = "saransh dwivedi";

		String es = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(i % 2 == 0)
			{
				es = es + (char)(c - 32);
			}
			else
			{
				es = es + (char)(c);
			}
		}
		System.out.print(es);
	}
}