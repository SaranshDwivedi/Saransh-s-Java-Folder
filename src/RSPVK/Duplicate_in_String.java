package RSPVK;

public class Duplicate_in_String {

	public static void main(String[] args) {
		
		String s = "saransh";
		
		int dup = 0;
		
		char c [] = s.toCharArray();
		
		for(int i = 0; i < c.length; i++)
		{
			//char c = s.charAt(i);
			
			for(int j = i+1; j < c.length; j++)
			{
				if(c[i] == c[j])
				{
					dup++;
				}
			}
		}
		System.out.println(dup+" are duplicate charaters in "+s+" string");
	}

}
