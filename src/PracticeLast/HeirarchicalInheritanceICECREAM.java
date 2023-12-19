package PracticeLast;

class IceCream
{
	String flavour;
}
class Vanila extends IceCream
{
	String taste;
}
class ButterScoach extends IceCream
{
	int price;
}
class Chocolate extends IceCream
{
	char color;
}

class HeirarchicalInheritanceICECREAM
{
	public static void main(String [] args)
	{
		HeirarchicalInheritanceICECREAM h = new HeirarchicalInheritanceICECREAM();

		Chocolate c = new Chocolate();
		System.out.println(c.color);
		//System.out.println(c.price);
		//System.out.println(c.taste);
		System.out.println(c.flavour);

		ButterScoach b = new ButterScoach();
		//System.out.println(b.color);
		System.out.println(b.price);
		//System.out.println(b.taste);
		System.out.println(b.flavour);

		Vanila v = new Vanila();
		//System.out.println(v.color);
		//System.out.println(v.price);
		System.out.println(v.taste);
		System.out.println(v.flavour);
	}
}