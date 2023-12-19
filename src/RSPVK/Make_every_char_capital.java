package RSPVK;

public class Make_every_char_capital {

	public static void main(String[] args) {
		
		String s = "saransh";
		
		String em = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			em = em + (char)(c - 32);
		}
		System.out.println(em);
	}

}
