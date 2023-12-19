package Abstraction_100_Percent;

public class AtmDriver 
{
	public static void main(String [] args)
	{
		Bank b = new ATM();
		
		b.Deposite(1000);
		
		b.Withdrow(200);
		
		b.Enquiry();
	}
}
