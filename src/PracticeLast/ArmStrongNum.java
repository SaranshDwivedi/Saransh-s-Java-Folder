package PracticeLast;

class ArmStrongNum
{
	public static void main(String [] args) 
	{
		int num = 153;
	
		int sum = 0;

		int r = 0;

		int copy = num;

		while(num>0)
		{
			r = num % 10;

			sum = sum + (r*r*r);

			num = num / 10;
		}
		if(sum == copy)
		{
			System.out.println("An ArmStrong Number");
		}
		else
		{
			System.out.println("is not An ArmStrong Number");
		}
	}
}