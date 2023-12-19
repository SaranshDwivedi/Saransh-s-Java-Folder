package RoughSheet;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		
		int sum = 0;
		
		//int rem = 0; 
		
		int copy = num;
		
		while(num>0)
		{
			int rem = num % 10;
			
			sum = sum + (rem*rem*rem);
			
			num = num / 10;
		}
		
		if(sum == copy)
		{
			System.out.println(copy+" is an ArmStrong Number");
		}
		else
		{
			System.out.println(copy+" is not an ArmStrong Number");
		}
	}

}
