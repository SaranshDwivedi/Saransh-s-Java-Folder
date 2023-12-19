package PracticeLast;

class water
{
	String Oderless;
}
class color extends water
{
	String ColorFul;
}
class baloons extends color
{
	String WaterinBaloons;
}

class MultiLevelInheritanceBaloon
{
	public static void main(String[] args) 
	{
		baloons h = new baloons();
		
		System.out.println(h.Oderless);
		System.out.println(h.ColorFul);
		System.out.println(h.WaterinBaloons);
		
		color c = new color();
		System.out.println(c.Oderless);
		System.out.println(c.ColorFul);
		// System.out.println(c.WaterinBaloons);	//CTE
		
		water w = new water();
		System.out.println(w.Oderless);
		// System.out.println(w.ColorFul);			//CTE
		// System.out.println(w.WaterinBaloon);		//CTE
	}
}
