package PracticeLast;

class OLA
{
	String name;
}
class Mini extends OLA
{
	int wheels;
}
class Uber extends OLA
{
	double price;
}
class Auto extends OLA
{
	int headLights;
}

public class UpCasting_DownCasting_OLA 
{
	public static void main(String [] args)
	{
		OLA o = new OLA();
		Mini m = new Mini();
		Uber u = new Uber();
		Auto a = new Auto();
		
		//Generalization
		OLA o1 = new Mini();
		OLA o2 = new Uber();
		OLA o3 = new Auto();
		
		//Specialization
		Mini m1 = (Mini) o;
		Uber u1 = (Uber) o;
		Auto a1 = (Auto) o;
		
		System.out.println(o.name);
		System.out.println(m.name);
		System.out.println(u.name);
		System.out.println(a.name);
		
	}
}
