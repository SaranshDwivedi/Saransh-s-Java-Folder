package PracticeLast;

class Bank
{
	private int Cash = 100;
	
	public int getCash()
	{
		return Cash;
	}
	public void setCash(int Cash)
	{
		this.Cash = Cash;
	}
}
public class EncapsulationBank {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		System.out.println(b.getCash());
		
		b.setCash(1000);
	}
}
