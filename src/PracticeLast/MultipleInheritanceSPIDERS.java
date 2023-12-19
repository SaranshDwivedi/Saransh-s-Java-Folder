package PracticeLast;

interface QSpiders
{
	public void test();
}

interface JSpiders
{
	public void develop();
}

class MultipleInheritanceSPIDERS implements QSpiders , JSpiders
{
	public void test()
	{
		System.out.println("Testers are there");
	}

	public void develop()
	{
		System.out.println("Developer are there");
	}

	public static void main(String [] args)
	{
		MultipleInheritanceSPIDERS s = new MultipleInheritanceSPIDERS();

		s.test();
		s.develop();
	} 
}