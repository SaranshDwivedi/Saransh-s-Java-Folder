package Constructor;

public class Constructor_Chaining_Basic {
	
	int id;
	String pass;
	
	Constructor_Chaining_Basic(int id)
	{
		this.id = id;
	}
	Constructor_Chaining_Basic(int id, String pass)
	{
		this(id);
		this.pass = pass;
	}
	void display()
	{
		System.out.println("User ID : "+id+" "+"PassWord : "+pass);
	}
	public static void main(String[] args) {
		
		Constructor_Chaining_Basic co = new Constructor_Chaining_Basic(202123,"Password@123");
		co.display();
	}

}
