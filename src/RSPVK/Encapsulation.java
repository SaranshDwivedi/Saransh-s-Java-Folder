package RSPVK;

public class Encapsulation 
{
	private int pin;
	private String name;
	
	public void setname(String name)
	{
		this.name = name;
	}
	public int getpin()
	{
		return pin;
	}
}
class Encap
{
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		e.setname("Saransh");
		e.getpin();
		
		System.out.println(e.getpin());
		e.setname("Saransh Dwivedi");
	}
}