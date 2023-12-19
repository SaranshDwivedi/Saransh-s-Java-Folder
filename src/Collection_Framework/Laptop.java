package Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;

public class Laptop 
{
	String brand;
	int ram;

	Laptop(String brand, int ram)
	{
		this.brand = brand;
		this.ram = ram;
	}
	public String toString()
	{
		return "Brand of Laptop : "+brand+" , "+"RAM : "+ram;
	}

	class LaptopDetails
	{
		public static void main(String[] args) {

			LinkedList<Laptop> ll = new LinkedList<Laptop>();
			
			Laptop l1 = new Laptop("Asus", 32);
			Laptop l2 = new Laptop("HP", 16);
			Laptop l3 = new Laptop("Dell", 12);
			
			ll.add(l1);
			ll.add(l2);
			ll.add(l3);
			
			for(Object o : ll)
			{
				Laptop l = (Laptop)o;
				System.out.println(o);
			}
			Iterator<Laptop> i = ll.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
		}
	}
}
