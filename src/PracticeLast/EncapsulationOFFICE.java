package PracticeLast;

class Employees
{	
	public void work()
	{
		System.out.println("Employee are Working");
	}
}

class Tester extends Employees
{
	public void work()
	{
		System.out.println("Testers are testing");
	}
}

class Developers extends Employees
{
	public void work()
	{
		System.out.println("Developers are Developing");
	}
}

class EncapsulationOFFICE
{
	public static void main(String [] args)
	{
		Employees e = new Employees();
		e.work();

		Tester t = new Tester();
		t.work();

		Developers d = new Developers();
		d.work();
	}
}