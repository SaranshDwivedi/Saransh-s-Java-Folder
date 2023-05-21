package List_Interface;

import java.util.ArrayList;

class ArrayListAddAll
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);

		ArrayList all = new ArrayList();
		all.add(80);
		all.add(90);
		all.add(100);
		System.out.println(all);

		al.addAll(all);
		System.out.println(al);
	}
}
