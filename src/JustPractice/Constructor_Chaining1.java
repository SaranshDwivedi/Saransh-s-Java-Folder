package JustPractice;

public class Constructor_Chaining1 
{
	String name;

	Constructor_Chaining1(String name)
	{
		this.name = name;
	}
}
public class Constructor_Chaining_ad extends Constructor_Chaining1
{
	int id;

	Constructor_Chaining_ad(int id, String name)
	{
		super(name);
		this.id = id;
	}
}

class demo1
{
	public static void main(String[] args) 
	{
		Constructor_Chaining_ad cc = new Constructor_Chaining_ad("Saransh", 11);
		System.out.println(cc);
	}
}
