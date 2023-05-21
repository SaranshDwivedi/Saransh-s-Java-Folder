package oOOPs;

class Father
{
	void bike()
	{
		System.out.println("Yamaha RX100");
	}
}
class Child extends Father
{
	void bike()
	{
		System.out.println("Yamaha 2023");
	}
}

public class MathodOverriding {

	public static void main(String[] args) {

		Child c = new Child();
		
		c.bike();
	
	}

}
