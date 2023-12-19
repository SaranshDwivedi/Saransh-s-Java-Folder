
public class Constructor_Overloading 
{
	String name;
	int mob;
	
	Constructor_Overloading(String name, int mob)
	{
		this.name = name;
		this.mob = mob;
	}
	Constructor_Overloading(int mob)
	{
		this.mob = mob;
	}
	Constructor_Overloading(String name)
	{
		this.name = name;
	}
	Constructor_Overloading(int mob, String name)
	{
		this.name = name;
		this.mob = mob;
	}
	void display()
	{
		System.out.println("Name : "+name+" , Mobile : "+mob);
	}
	
	public static void main(String[] args) 
	{
		Constructor_Overloading c1 = new Constructor_Overloading("Sehwag");
		Constructor_Overloading c2 = new Constructor_Overloading(320);
		Constructor_Overloading c3 = new Constructor_Overloading("Dravid", 287);
		Constructor_Overloading c4 = new Constructor_Overloading(265, "Sachin");
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
	}
}
