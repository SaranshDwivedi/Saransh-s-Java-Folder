package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Mobile 
{
	String brand;
	int price;

	Mobile(String brand, int price)
	{
		this.brand = brand;
		this.price = price;
	}
	public String toString()
	{
		return "Brand of Cell Phone : "+brand+" , Price : "+price; 
	}
	
	public class MobileDetails
	{
		public static void main(String[] args) 
		{
			ArrayList<Mobile> al = new ArrayList<Mobile>();
			Mobile m1 = new Mobile("Samsung", 39);
			Mobile m2 = new Mobile("Sony", 45);
			Mobile m3 = new Mobile("BlackBerry", 85);
			
			al.add(m1);
			al.add(m2);
			al.add(m3);
			
			Iterator<Mobile> i = al.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			
			for(Object o : al)
			{
				Mobile m = (Mobile)o;
				System.out.println(m);
			}
		}
	}
}
