
public class Constructor_Chaining 
{
	int mob;
	String name;

	Constructor_Chaining(int mob)
	{
		this.mob = mob;
	}
	Constructor_Chaining(String name)
	{
		this.name = name;
	}
	Constructor_Chaining(String name, int mob)
	{
		this(mob);
		this.name = name;
	}
	Constructor_Chaining(int mob, String name)
	{
		this(name);
		this.mob = mob;
	}
	
	void display()
	{
		System.out.println("Runs : "+mob+", Players : "+name);
	}
	public static void main(String[] args) {
		
		Constructor_Chaining c1 = new Constructor_Chaining(99, "David");
		Constructor_Chaining c2 = new Constructor_Chaining(100);
		Constructor_Chaining c3 = new Constructor_Chaining("Matthwe");
		Constructor_Chaining c4 = new Constructor_Chaining("Adam", 101);
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
	}
}


