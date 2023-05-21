package logical_programings;

public class Prime_Number_1 {

	public static void main(String[] args) {
		
		int a = 13;
		
		int temp = 0;
		
		for(int i = 2; i <= (a-1); i++)
		{
			if(a%i==0)
			{
			 temp = temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Not Prime");
		}
		else
		{
		 System.out.println("Prime");	
	}

	}
	}
