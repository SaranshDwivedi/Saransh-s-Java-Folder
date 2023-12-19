package PracticeLast;

public class CapitalizeAllWordsString {

	public static void main(String[] args) {
		
		String s = "java is easy to learn";
		
		char [] c = s.toCharArray();
		
		for(int i = 0; i<c.length; i++)
		{
			if(c[i]==' ')
			{
				continue;
			}
			else
			{
				c[i] = (char)(c[i]-32);
			}
		}
		for(int j = 0; j<c.length; j++)
		{
			System.out.println(c[j]);
		}

	}

}
