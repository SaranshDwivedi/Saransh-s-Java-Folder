package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Laptop_Obj_Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("lenevo");
		ll.add("hp");
		ll.add("asus");
		ll.add("dell");
		
		Iterator<String> i = ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
