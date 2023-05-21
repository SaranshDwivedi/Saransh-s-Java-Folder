package List_Interface;

import java.util.ArrayList;

class ArrayListRemoveIndex  
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);			//2
		al.add(40);
		al.add(50);

		System.out.println(al);

		//remove element by = remove(index)

		al.remove(2);
		System.out.println(al);
	}
}
