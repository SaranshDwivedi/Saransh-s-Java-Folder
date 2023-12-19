package PracticeLast;

class MethodOverLoadingFruit
{
	public static void m1()
	{
		System.out.println("no-args state");
	}
	public static void m1(int i)
	{
		System.out.println("Int args State");
	}
	public static void m1(String s)
	{
		System.out.println("String args state");
	}

	public static void main(String [] args)
	{
		//Fruit f = new Fruit();
		m1(10);
		m1();
		m1("LDC");
	}	
}