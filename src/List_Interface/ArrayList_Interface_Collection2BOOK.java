package List_Interface;

import java.util.ArrayList;

class Bookal
{
	//instance value
	String name;
	int pages;
	double price;

	//creating "Constructor" to initialize the created object
	Bookal(String name, int pages , double price)
	{
		this.name = name;
		this.pages = pages;
		this.price = price;
	}

	//@override
	public String toString()
	{
		return "[Name : "+name+" , Pages : "+pages+" , Price : "+price+"]";
	}
}

class ArrayList_Interface_Collection2BOOK
{
	public static void main(String[] args) 
	{
		ArrayList<Bookal> al = new ArrayList<Bookal>();
		
		Bookal b1 = new Bookal("Java",1000,999.99);
 		Bookal b2 = new Bookal("Python",550,499.99);
		Bookal b3 = new Bookal("Ruby",300,399.99);
		Bookal b4 = new Bookal("C++",455,299.99);

		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);

		for (Bookal a : al)
		{
			System.out.println(a);
			
		}

		//System.out.println("Hello World!");
	}
}
