package RSPVK;

abstract public class Abstraction 
{
	public abstract void camara();
	public abstract void ram();
	public void price()
	{
		System.out.println("1.5 lakhs");
	}
}
abstract class Abstraction1 extends Abstraction
{
	@Override
	public void camara()
	{
		System.out.println("200 MP");
	}
}
class Abstraction2 extends Abstraction1
{
	@Override
	public void ram()
	{
		System.out.println("32 GB");
	}
}
class AbstractionFinal
{
	public static void main(String[] args)
	{
		Abstraction2 a = new Abstraction2();
		a.camara();
		a.price();
		a.ram();
	}
}