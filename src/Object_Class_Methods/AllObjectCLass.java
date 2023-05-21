package Object_Class_Methods;

class Book 
{
	//instance variable
	String name;
	double price;	
	int pages;
	char rating;

	Book(String name , double price , int pages , char rating)
	{
		//creating "Constructor" which is use to initialize the object
		this.name = name;
		this.price = price;
		this.pages = pages;
		this.rating = rating;
	}
	//appling "toString()"
	public String toString()
	{
		return "[Book Name : "+name+" , Price : "+price+" , Pages : "+pages+" , Ratings : "+rating+"]";
	}
	//appling "equals(Object)"
	public boolean equals(Object o)
	{
		//Downcast the book class with Object Class
		Book temp = (Book)o;
		if (this.name==temp.name && this.price==temp.price && this.pages==temp.pages && this.rating==temp.rating)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}
	//appling "hashCode()"
	public int hashCode()
	{
		int hashCode2 = name.hashCode()+((Double)price).hashCode()+((Integer)pages).hashCode()+((Character)rating).hashCode();
		return hashCode2;
	} 
}

 class AllObjectClass
 {
 	public static void main(String[] args) 
	{
		Book b1 = new Book("Java",999.75,1000,'S');
		Book b2 = new Book("Python",695.50,498,'H');
		Book b3 = new Book("C++",1500.75,1500,'S');
		Book b4 = new Book("Ruby",450.25,299,'G');
		Book b5 = new Book("Pearl",700.85,350,'A');

		System.out.println("------------toSring()---------------");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		System.out.println(b5.toString());

		System.out.println("------------equals(Object)---------------");
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b3));
		System.out.println(b3.equals(b4));
		System.out.println(b4.equals(b4));	

		System.out.println("------------hashCode()---------------");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		System.out.println(b5.hashCode());
	}
}
