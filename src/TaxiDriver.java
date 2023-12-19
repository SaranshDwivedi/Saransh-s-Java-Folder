class Taxi
{
	String driver;
}
class Mini extends Taxi
{
	int wheels;
}
class Uber extends Taxi
{
	int wheelss;
}
class OLA extends Taxi
{
	int wheelsss;
}

class TaxiDriver
{
	public static void main(String [] args)
	{
		Taxi t = new Taxi();
		Taxi t1 = new Mini();
		Taxi t2 = new Uber();
		Taxi t3 = new OLA();
		
		Mini m = new Mini();
		Uber u = new Uber();
		OLA o = new OLA();
		
		System.out.println(t.driver);
		System.out.println(t1 == m);
		System.out.println(t2 == u);
		System.out.println(t3 == o);

	}
}