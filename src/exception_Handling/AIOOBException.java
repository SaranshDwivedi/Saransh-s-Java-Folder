package exception_Handling;

public class AIOOBException {

	public static void main(String[] args) 
	{
		int a [] = {1,1,1,2,5};

		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("ByeBye");
	}
}
