package RSPVK;

public class Make_even_word_capital_in_String {

	public static void main(String[] args) {
		
		String s = "saransh";
		
		String em = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(i % 2 == 0)
			{
				em = em + (char)(c-32);
			}
			else
			{
				em = em + (char)(c);
			}
		}
		System.out.println(em);
	}

}
