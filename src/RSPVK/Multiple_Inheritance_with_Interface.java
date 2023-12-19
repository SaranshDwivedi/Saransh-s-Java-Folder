package RSPVK;
interface Qspider
{
	void test();
}
interface Jspider
{
	void development();
}
class Multiple_Inheritance_with_Interface implements Qspider, Jspider
{
	@Override
	public void test()
	{
		System.out.println("testing is available");
	}
	@Override
	public void development()
	{
		System.out.println("development is crucial for today");
	}
	public static void main(String[] args) 
	{
		Multiple_Inheritance_with_Interface mi = new Multiple_Inheritance_with_Interface();
		mi.test();
		mi.development();
	}
}
