package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_ArrangeMent_Order 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
			
		al.add(45);
		al.add(88);
		al.add(660);
		al.add(9);
		al.add(11);
	
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);
	}
}
