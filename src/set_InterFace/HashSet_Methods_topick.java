package set_InterFace;

import java.util.HashSet;
import java.util.Iterator;

class HashSet_Methods_topick 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(12);
		hs.add("Ram");
		hs.add('M');
		hs.add(45.99);
		hs.add(99.99f);
		System.out.println(hs);

		System.out.println("- - - - -For Each- - - - -");
		for (Object a : hs)
		{
			System.out.println(a);
		}

		System.out.println("- - - - -While- - - - -");
		Iterator i = hs.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	}
}
