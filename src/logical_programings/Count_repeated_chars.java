package logical_programings;

import java.util.HashSet;

public class Count_repeated_chars {

	public static void main(String[] args) {
		
		String str = "aaabbcdddddeee";
		
		char [] arrs = str.toCharArray();
		
		HashSet hs1 = new HashSet();
		
		//HashSet<Character> hs = new HashSet<Charater>();
		
		for(int i = 0; i<str.length(); i++)
		{
			hs1.add(arrs[i]);
		}
		System.out.println(hs1);
	
	
	for(char ch : arrs)
	{
		int count = 0;
		
		for(int j = 0; j<arrs.length; j++)
		{
			if(ch == arrs[j])
			{
				count++;
			}
			
		}
		System.out.println(ch +"  "+count);
	}
}
}