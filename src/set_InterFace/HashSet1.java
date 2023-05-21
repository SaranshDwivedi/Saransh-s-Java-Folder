package set_InterFace;

import java.util.HashSet;

class HashSet1
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add('X');
		hs.add("Sam");
		hs.add("has");
		hs.add(40);	
		hs.add('X');
		hs.add("of his");
		hs.add(39.50);
		hs.add('X');
		hs.add('X');

		System.out.println(hs);
	}
}
