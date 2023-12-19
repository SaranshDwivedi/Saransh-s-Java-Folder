package PracticeLast;
class Taxi
{
	String driver;
}	
class Uber extends Taxi
{
	int HeadLights;
}
class Mini extends Taxi
{
	int wheels;
}
class TaxiDownCast
{
	public static void main(String [] args)
	{
		Taxi t1 = new Taxi();
		
		Uber u = new Uber();
		Taxi t = (Taxi) u; 
		
		Mini m = new Mini();
		Taxi t2 = (Taxi) m;
	}
}