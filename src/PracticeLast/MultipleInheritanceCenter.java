package PracticeLast;

interface Qspiders
{
	public void test();
}
interface Jspiders
{
	public void develop();
}
class MultipleInheritanceCenter implements Qspiders, Jspiders
{
	public void test()
	{
		System.out.println("Testers are here");
	}
	public void develop()
	{
		System.out.println("Developers are here");
	}

	public static void main(String [] args)
	{
		MultipleInheritanceCenter m = new MultipleInheritanceCenter();

		m.test();

		m.develop();
	}
}