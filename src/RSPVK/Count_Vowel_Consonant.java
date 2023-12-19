package RSPVK;

public class Count_Vowel_Consonant {

	public static void main(String[] args) {

		String s = "SaranshDwivedi";

		int VowCt = 0;
		int ConCt = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c == 'a'|| c=='e'|| c=='i'|| c=='o'||c=='u' ||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				VowCt++;
			}
			else
			{
				ConCt++;
			}
		}
		System.out.println(VowCt+" are Vowels");
		System.out.println(ConCt+" are Consonants");
	}

}
