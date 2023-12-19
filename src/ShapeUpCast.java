class shape
{
	double area;
}
class circle extends shape
{
	int radious;
}

class ShapeUpCast
{
	public static void main(String [] args)
	{
		circle c = new circle();
		shape s = new circle();
		
		System.out.println(c.radious);
		System.out.println(c.area);
		System.out.println(s == c);

	}
}