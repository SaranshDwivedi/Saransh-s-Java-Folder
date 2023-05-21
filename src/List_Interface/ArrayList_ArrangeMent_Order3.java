package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_ArrangeMent_Order3
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		int [] arr = {25,4,5,45,78,99,101,98};

		for (int i = 0; i<arr.length ; i++)
		{
			al.add(arr[i]);
		}
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);

	}
}
