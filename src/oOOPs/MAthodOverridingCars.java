package oOOPs;

class Maruti800
{
	void Starts()
	{
		System.out.println("Maruti800 has started");
	}
	void Stops()
	{
		System.out.println("Maruti800 has been Stoped");
	}
}
class SwiftDezire extends Maruti800
{
	void Starts()
	{
		System.out.println("SwiftDezire has Started");
	}
	void Stops()
	{
		super.Stops();
		System.out.println("SwiftDezire has been Stoped");
	}
}

public class MAthodOverridingCars {

	public static void main(String[] args) {

		SwiftDezire sd = new SwiftDezire();

		sd.Starts();

		sd.Stops();
	}

}
