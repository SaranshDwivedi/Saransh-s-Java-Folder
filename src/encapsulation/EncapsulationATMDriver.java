package encapsulation;

class ATM
{
	private int balance;		//w & r
	private String accHolder;	//r
	private long accNum;		//r		
	private int depossiteBalance;	//w
 
	public void setdepossiteBalance(int depossiteBalance)
	{
		this.depossiteBalance = depossiteBalance;
	}
	public long getaccNum()
	{
		return accNum;
	}
	public String getaccHolder()
	{
		return accHolder;
	}
	public int getbalance()
	{
		return balance;
	}
	public void setbalance(int blanace)
	{
		if (balance>0)
		{
			this.balance = balance;
		}
		else 
		{
			System.out.println("Balance can not be ZERO");
		}
	}
}

class EncapsulationATMDriver
{
	public static void main (String [] args)
	{
		ATM a = new ATM();
		System.out.println(100);
		System.out.println(a.getbalance());
	}
}