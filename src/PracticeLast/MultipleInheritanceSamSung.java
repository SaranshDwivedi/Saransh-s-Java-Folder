package PracticeLast;

interface SamSung1
{
	public void call();
	public void ram();
}

interface SamGuru extends SamSung1
{
	public void cam();
	public void message();
}

class MultipleInheritanceSamSung implements SamGuru
{
	public void call()
	{
		System.out.println("Calling");
	}
	public void ram()
	{
		System.out.println("8GB Ram");
	}
	public void cam()
	{
		System.out.println("120X Camara");
	}
	public void message()
	{
		System.out.println("Can Message");
	}


	public static void main (String [] args)
	{
		MultipleInheritanceSamSung s = new MultipleInheritanceSamSung();
		s.call();
		s.ram();
		s.message();
		s.cam();
	}
}