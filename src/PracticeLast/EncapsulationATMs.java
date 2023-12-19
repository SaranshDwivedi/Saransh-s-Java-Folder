package PracticeLast;

class ATM
{
	private int bal;

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
			System.out.println("Balance can't be Zero or in Negetive");
		}
	}
}

class EncapsulationATMs
{
	public static void main(String [] args)
	{
		ATM a = new ATM();

		System.out.println(a.getbal());

		a.setbal(1000);

		System.out.println(a.getbal());
	}
}