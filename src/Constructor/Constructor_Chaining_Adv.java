package Constructor;

public class Constructor_Chaining_Adv 
{
	int id;

	Constructor_Chaining_Adv(int id)
	{
		this.id = id;
	}

	public class Constructor_Chaining_Adv1 extends Constructor_Chaining_Adv
	{
		String name;
		
		Constructor_Chaining_Adv1(int id, String name)
		{
			super(id);
			this.name = name;
		}
		void display()
		{
			System.out.println("userID : "+id+" "+"UserName : "+name);
		}
		public static void main(String [] args)
		{
			Constructor_Chaining_Adv1 cc = new Constructor_Chaining_Adv1("Farguson",33);
			cc.display();
		}
	}
}
