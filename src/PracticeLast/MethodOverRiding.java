package PracticeLast;

class parent
{
	public void properties()
	{
		System.out.println("Land+Cash+Gold");
	}

	public void marry()
	{
		System.out.println("Alia");
	}
}
class child extends parent
{
	public void marry()
	{
		System.out.println("Kiara");
	}
}
class MethodOverLoading
{
	public static void main(String [] args)
	{
		parent p = new parent();
		child c = new child();

		p.properties();
		p.marry();

		c.properties();
		c.marry();
	}
}