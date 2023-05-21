package objectClass;

import java.util.TreeSet;
import java.util.Iterator;

class ShoeTS 
{
	String brand;
	int size;

	ShoeTS(String brand , int size)
	{
		this.brand=brand;
		this.size=size;
	}
	//@override
	public String toString()
	{
		return "[Brand : "+brand+" , Size : "+size+"]";
	}

	//@override
	public int CampareTo(Object o)
	{
		ShoeTS temp = (ShoeTS)o;
		if (this.size > temp.size)
		{
			return 1;
		}
		else if (this.size < temp.size)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
class TreeSetShoe
{
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		ts.add(new ShoeTS("Adidas",10));
		ts.add(new ShoeTS("Puma",11));
		ts.add(new ShoeTS("Skechers",9));
		ts.add(new ShoeTS("Air Jorden",12));
		ts.add(new ShoeTS("Kamakazi",8));

		Iterator i = ts.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
