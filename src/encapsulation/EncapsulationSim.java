package encapsulation;

class Sim
{
	private long phoNum;					//r & w
	private char color;						//r & w
	private String serviceProvider;		//r & w
	private int balance;						//r & w

	public int getbalance()   //to read
	{
		return balance;
	}
	public void setbalance(int balance)	//to write
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
	public String getserviceProvider()	//to read
	{
		return serviceProvider;
	}
	public void setserviceProvider(String serviceProvider)
	{
		this.serviceProvider = serviceProvider;
	}
	public char getcolor()
	{
		return color;
	}
	public void setcolor(char color)
	{
		this.color = color;
	}
	public long getphoNum()
	{
		return phoNum;
	}
	public void setphoNum(long phoNum)
	{
		this.phoNum = phoNum;
	}
}
class EncapsulationSim
{
	public static void main(String[] args) 
	{
		Sim s = new Sim();
		
        System.out.println(100);
		System.out.println(s.getbalance());
	}
}
