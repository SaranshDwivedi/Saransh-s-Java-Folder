package RSPVK;

public class Method_OverRiding 
{
	public void m() 
	{
		System.out.println("m1");
	}
	public void m(int a)
	{
		System.out.println("m2 with int");
	}
	public void m(String s)
	{
		System.out.println("m3 with string");
	}
	public static void main(String[] args) 
	{
		Method_OverRiding mo = new Method_OverRiding();
		mo.m();
		mo.m(100);
		mo.m("saransh");
	}
}
