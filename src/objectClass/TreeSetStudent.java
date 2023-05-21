package objectClass;

import java.util.TreeSet;
import java.util.Iterator;

class StudentTS 
{
	String name;
	int marks;

	StudentTS(String name , int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return "[Name : "+name+" , Marks : "+marks+"]";
	} 
	public int CompareTo(Object o)
	{
		//DownCasting 
		StudentTS temp = (StudentTS)o;
		if (this.marks > temp.marks)
		{
			return 1;
		}
		else if (this.marks < temp.marks)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
 }

 class TreeSetStudent
 {
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();

		ts.add(new StudentTS("Sam",94));
		ts.add(new StudentTS("David",81));
		ts.add(new StudentTS("Mikey",76));
		ts.add(new StudentTS("Austin",48));

		System.out.println(ts);

		for (Object object : ts) {
			
		}
		Iterator i = ts.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
