package oOOPs;

class Multiple_Inheritance 
{
	void m1() 
	{
		System.out.println("Home");
	}
}
class  Multiple_Inheritance1
{
	void m2()
	{
		System.out.println("Car");
	}
}

class Child1 extends  Multiple_Inheritance
{
	public static void main(String[] args) {
		
	Child1 c = new Child1();
	
	c.m1();
	
	c.m2();
}
}