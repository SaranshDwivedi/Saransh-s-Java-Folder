package PracticeLast;

class Parent1
{
	String Mustang;
}
class child1 extends Parent1
{
	String Porche;
}

class SingleLevelInheritance
{
	public static void main(String [] args)
	{
		Parent1 p = new Parent1();
		child1 c = new child1();

		System.out.println(p.Mustang);
		// System.out.println(p.Porche);  //Compile Time Error = because parent cant get the properties of child class

		System.out.println(c.Mustang);
		System.out.println(c.Porche);
	}
}