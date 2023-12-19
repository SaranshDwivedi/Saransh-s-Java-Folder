package PracticeLast;
public class PJ
{
	public static void m1(int a)
	{
		System.out.println("Override int args");
	}
	/*public static void m1(String s)
	{
		System.out.println("override string args");
	}*/
}
public class OverloadAndOverride extends PJ{

	public static void m1(int a)
	{
		System.out.println("Int Args");
	}
	public static void m1(String s)
	{
		System.out.println("string args");
	}

	public static void main(String[] args)
	{
		System.out.println("main starts");
		m1(10);
		m1("avb");
		System.out.println("main ends");
	}
}
