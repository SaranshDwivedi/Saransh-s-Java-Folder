package oOOPs;

class Fruits
{	
	void taste()
	{
		System.out.println("Tastes Good");
	}
	void smells()
	{
		System.out.println("Smells Good");
	}
	void riped()
	{
		System.out.println("Fully Riped");
	}
}

class Mango extends Fruits
{
	{
	super.taste();
	}
	void smells()
	{
		System.out.println("Mango smells Sweet");
	}
	{
		super.riped();
	}
}

class StawBerry extends Mango
{
	void taste()
	{
		System.out.println("StawBerry is Sweet");
	}
	void smell()
	{
		System.out.println("StawBerry Smells Good");
	}
	
	{
		super.riped();
	}
	
}

public class MathodOverridingFRUITS {

	public static void main(String[] args) {

		StawBerry sb = new StawBerry();
		
		sb.taste();
		sb.smell();
		sb.riped();
		
	}

}
