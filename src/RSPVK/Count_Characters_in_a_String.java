package RSPVK;

public class Count_Characters_in_a_String {

	public static void main(String[] args) {

		String s = "saransh110393dwivedi@gmail.com";

		int charCt = 0;
		int speCt = 0;
		int numCt = 0;

		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if(c >= '0' && c <= '9')
			{
				numCt++;
			}
			else if(c >= 'a' && c <= 'z' || c >= 'A' && c <='Z')
			{
				charCt++;
			}
			else
			{
				speCt++;
			}
		}
		System.out.println(charCt+" are charaters");
		System.out.println(speCt+" are Special charaters");
		System.out.println(numCt+" are numbers");
	}

}
