package PracticeLast;

abstract class Samsung
{
	public abstract void ram();
	public abstract void Cam();
	public abstract void graphics();
	public abstract void processor();
}

abstract class SamGal1 extends Samsung
{
	public void ram()
	{
		System.out.println("16 GB Ram");
	}
}
abstract class SamGal2 extends SamGal1
{
	public void Cam()
	{
		System.out.println("126 MP of Cam");
	}
}
abstract class SamGal3 extends SamGal2
{
	public void graphics()
	{
		System.out.println("990R NVidia");
	}
}
class SamGal23 extends SamGal3
{
	public void processor()
	{
		System.out.println("1055 SanpDragon Z");
  	}
}

class AbstractionSamsung 
{
	public static void main(String [] args)
	{
		SamGal23 s = new SamGal23();

		s.ram();
		s.Cam();
		s.graphics();
		s.processor();
	}
}

