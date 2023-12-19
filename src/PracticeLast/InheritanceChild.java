package PracticeLast;

class Father
{
	public void bike()
	{
		System.out.println("Yamaha RX100");
	}
}
class  InheritanceChild extends Father
{
	public void house()
	{
		System.out.println("Banglow 25000sqrFeet");
	}

	public static void main(String [] args)
	{

		Father f = new Father();
		f.bike();

		InheritanceChild c = new InheritanceChild();
		c.bike();
		c.house();
	}
}