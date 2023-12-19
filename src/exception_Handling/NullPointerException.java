package exception_Handling;

public class NullPointerException {

	public static void main(String[] args) 
	{
		int a [];
		
		try
		{
			System.out.println(a[12]);
		}
		catch (NullPointerException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
