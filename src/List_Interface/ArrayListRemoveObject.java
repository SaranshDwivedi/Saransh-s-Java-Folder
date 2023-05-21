package List_Interface;

import java.util.ArrayList;

class ArrayListRemoveObject 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(50);
		System.out.println(al);

		al.remove((Integer)40);
		System.out.println(al);
	}
}
