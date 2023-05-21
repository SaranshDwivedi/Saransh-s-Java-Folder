package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_Interface_Collection1
{
	public static void main (String [] args)
	{
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
			
		Collections.reverse(al);
		System.out.println(al);
	
		for (int a : al)
		{
			System.out.println(a);
		}		
	}
}
		