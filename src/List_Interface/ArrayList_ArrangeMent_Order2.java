package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class ArrayList_ArrangeMent_Order2
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		int [] arr = {120,655,78,1,11,2,99,119};

		for (int i = 0; i<arr.length; i++)
		{
			al.add(arr[i]);
		}
		System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);

		Collections.sort(al);
		System.out.println(al);
	}
}
