package set_InterFace;

import java.util.ArrayList;
import java.util.HashSet;

class HashSet_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(450);
		al.add(11);
		al.add(450);
		al.add(11);
		al.add(29);
		System.out.println(al);

		//to eliminate duplicate values , converting into "HashCode"
		HashSet hs = new HashSet(al);
		System.out.println(hs);

		//to convert back into Arraylist
		ArrayList al1 = new ArrayList(hs);
		System.out.println(al1);
	}
}
