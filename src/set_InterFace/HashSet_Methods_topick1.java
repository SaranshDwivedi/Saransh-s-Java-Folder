package set_InterFace;

import java.util.HashSet;
import java.util.Iterator;

class HashSet_Methods_topick1 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("Dalveer");
		hs.add('N');
		hs.add("Singh");
		hs.add(99);
		hs.add(101.33);
		hs.add(11);
		hs.add(11);
		System.out.println(hs);

		System.out.println("- - - - -For Each- - - - -");
		for (Object f : hs)
		{
			System.out.println(f);
		}
	
		System.out.println("- - - - -While- - - - -");
		Iterator i = hs.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}
}
