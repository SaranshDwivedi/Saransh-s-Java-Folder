package List_Interface;

import java.util.ArrayList;

class ArrayListRetain
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		ArrayList all = new ArrayList();
		
		all.add(40);
		all.add(50);
		all.add(60);
		all.add(70);

		System.out.println(all);

		al.retainAll(all);
		System.out.println(al);

		all.retainAll(al);
		System.out.println(all);
	}
}
