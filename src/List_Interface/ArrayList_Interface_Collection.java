package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_Interface_Collection
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);		
		al.add(11);
		al.add(101);
		al.add(1);
		al.add(9);
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		for (int a : al)
		{
			System.out.println(a);	
		}
	}
}	
