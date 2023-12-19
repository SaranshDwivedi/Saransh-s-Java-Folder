package PracticeLast;

class BankATM
{
	private int bal = 1200;

	public int getbal()
	{
		return bal;
	}
	
	public void setbal(int bal)
	{
		if(bal > 0)
		{
			this.bal = bal;
		}
		else
		{
			System.out.println("Balance can not be Zero or Negetive");
		}
	}
}

class EncapsulationATM
{
	public static void main(String [] args)
	{
		BankATM b = new BankATM();

		System.out.println(1000);
	
		System.out.println(b.getbal());
		
		System.out.println(-21000);
	}
}