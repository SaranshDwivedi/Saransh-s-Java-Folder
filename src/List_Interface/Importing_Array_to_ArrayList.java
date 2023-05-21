package List_Interface;

import java.util.ArrayList;

class Importing_Array_to_ArrayList
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		int [] arr = {1,2,3,4,5,6,7,8};
		
		for (int i = 0; i<arr.length; i++)
		{
			al.add(arr[i]);
		}
			System.out.println(al);
	}
}
