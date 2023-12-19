
public class Count_Vowels_consonants_in_String {

	public static void main(String[] args) {
		
		String s = "saransh";
		
		int v = 0;
		int cn = 0;
		int sp = 0;
		int nm = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c >= '0' && c <= '9')
			{
				nm++;
			}
			else if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				v++;
			}
			else
			{
				cn++;
			}
		}
		System.out.println("Vowels are : "+v);
		System.out.println("Consonants are : "+cn);
		System.out.println("Numbers are : "+nm);
	}

}
