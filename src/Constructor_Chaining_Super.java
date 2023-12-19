class Constructor_Chaining_Super {

	int pages;
	String name;
	double price;

	Constructor_Chaining_Super(String name)
	{
		this.name = name;
	}
	Constructor_Chaining_Super(int pages)
	{
		this.pages = pages;
	}
	Constructor_Chaining_Super(double price)
	{
		this.price = price;
	}
	Constructor_Chaining_Super(int pages, String name)
	{
		this(pages);
		this.name = name;
	}
	Constructor_Chaining_Super(String name, double price)
	{
		this(price);
		this.name = name;
	}
}
class Constructor_Chaining_Super1 extends Constructor_Chaining_Super
{
	int num;
	String author;
	
	Constructor_Chaining_Super1(int pages)
	{
		super(pages);
	}
	Constructor_Chaining_Super1(String name, int pages)
	{
		super(name);
		this.pages = pages;
	}
}