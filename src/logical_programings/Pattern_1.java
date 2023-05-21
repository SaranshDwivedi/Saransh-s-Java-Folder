package logical_programings;

public class Pattern_1 {

	public static void main(String[] args) {
		
		for(int r = 1; r<=5 ; r++)
		{
			for(int c = 1; c <= 5; c++)
			{
				if(c >= r)
				{
					System.out.print(" * ");		//to give spaces between stars
				}
				else
				{
					System.out.print("");			//to give spaces between stars between rows
				}
			}
			System.out.println();
		}

	}

}
//  * * * * *
//  * * * *
//  * * * 
//  * * 
//  *