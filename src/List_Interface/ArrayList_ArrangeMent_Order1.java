package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_ArrangeMent_Order1
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		int [ ] arr = {10,23,48,77,99,101,49,102};

		for (int i = 0 ; i<arr.length; i++)
		{
			al.add(arr[i]);
		}
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
	}
}
