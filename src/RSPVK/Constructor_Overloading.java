package RSPVK;

public class Constructor_Overloading 
{
	String name;
	int price;
	char model;
	
	Constructor_Overloading(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	Constructor_Overloading(String name)
	{
		this.name = name;
	}
	Constructor_Overloading(int price)
	{
		this.price = price;
	}
	Constructor_Overloading(int price, char model, String name)
	{
		this.price = price;
		this.model = model;
		this.name = name;
	}
	public static void main(String[] args) {
		Constructor_Overloading co = new Constructor_Overloading("Saransh");
		Constructor_Overloading co1 = new Constructor_Overloading("Saransh", 11);
		Constructor_Overloading co2 = new Constructor_Overloading(11);
		Constructor_Overloading co3 = new Constructor_Overloading(11, 'R', "Saransh");
	}
}
