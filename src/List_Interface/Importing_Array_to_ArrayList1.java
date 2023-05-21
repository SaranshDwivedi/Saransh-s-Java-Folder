package List_Interface;

import java.util.ArrayList;
import java.util.Collections;

class Importing_Array_to_ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		int [] arr = {45,6,5,4,5,88,85,3,2,5};

		for (int i = 0 ; i<arr.length ; i++)
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
