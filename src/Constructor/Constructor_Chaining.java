package Constructor;

public class Constructor_Chaining {

	String Sname;
	String Fname;
	int id;
	
	Constructor_Chaining(String Fname)
	{
		this.Fname = Fname;
	}
	Constructor_Chaining(int id)
	{
		this.id = id;
	}
	Constructor_Chaining(String Fname, String Sname)
	{
		this(Fname);
		this.Sname = Sname;
	}
	Constructor_Chaining(int id, String Sname)
	{
		this(Sname);
		this.id = id;
	}
	void display()
	{
		System.out.println("Father : "+Fname+" , "+"SON : "+Sname);
	}
	public static void main(String[] args) 
	{
		Constructor_Chaining co1 = new Constructor_Chaining("Mufasa");
		Constructor_Chaining co2 = new Constructor_Chaining("Mufasa" , "Simba");
		Constructor_Chaining co3 = new Constructor_Chaining(99);
		Constructor_Chaining co4 = new Constructor_Chaining(99, "SIMBA");
		
		co2.display();
	}

}
