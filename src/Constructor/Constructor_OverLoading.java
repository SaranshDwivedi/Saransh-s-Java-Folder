package Constructor;

public class Constructor_OverLoading 
{
	int RollNumber;
	String name;

	Constructor_OverLoading()
	{

	}
	Constructor_OverLoading(int RollNumber)
	{
		this.RollNumber = RollNumber;
	}
	Constructor_OverLoading(int RollNumber , String name)
	{
		this.name = name;
		this.RollNumber = RollNumber;
	}
	void display()
	{
		System.out.println("Name : "+name+" , "+"Roll Number : "+RollNumber);
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) 
	{
		Constructor_OverLoading co1 = new Constructor_OverLoading(102);
		Constructor_OverLoading co2 = new Constructor_OverLoading(201 , "David");
		co1.display();
		co2.display();
	}

}
