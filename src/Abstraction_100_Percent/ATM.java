package Abstraction_100_Percent;

public class ATM implements Bank{

	int amount = 1000;
	
	public void Deposite(int bal)
	{
		System.out.println("Rs : "+bal+" Deposited");
		
		amount += bal;
	}
	
	public void Withdrow(int bal)
	{
		System.out.println("Rs : "+amount+" Withdrown");
		
		amount -= bal;
		
	}
	
	public void Enquiry()
	{
		System.out.println("Total Balance : "+amount);
	}
	
}
