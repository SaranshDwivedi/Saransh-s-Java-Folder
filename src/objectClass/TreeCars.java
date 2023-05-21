package objectClass;

import java.util.Iterator;
import java.util.TreeSet;

class  Cars
{
	//instance variable
	String brand;
	double price;
	double milage;
	char type;

	//Constructor creation for object initialization
	Cars(String brand , double price , double milage , char type)
	{
		this.brand = brand;
		this.price = price;
		this.milage = milage;
		this.type = type;
	}
	
	//overriding toString method = to get the states of the object
	public String toString()
	{
		return "[Brand : "+brand+" , Price : "+price+" , Milage : "+milage+" , Type : "+type+"]";
	}
	//to compare the state , appling CompareTo method
	public int CompareTo(Object o)
	{
		Cars temp = (Cars)o;
		if (this.price > temp.price)
		{
			return 1;
		}
		else if (this.price < temp.price)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
 }

 class TreeCars
 {
	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet();
		
		ts.add(new Cars("Lamberghini",15.39,2.1,'P'));
		ts.add(new Cars("Porsh",7.88,7.3,'E'));
		ts.add(new Cars("Mercedease",4.23,9.81,'P'));
		ts.add(new Cars("Audi",1.28,11.12,'D'));
		ts.add(new Cars("Ford Mustang",7.33,3.0,'D'));

		Iterator i = ts.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
