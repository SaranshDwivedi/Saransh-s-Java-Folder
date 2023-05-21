package exception_Handling;

class IndexOutOfBounds_Exception 
{
	public static void main(String[] args) 
	{
		String str = "WON";

		try
		{
			System.out.println(str.charAt(4));
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.println("IOOBE handled SucessFully");
			System.out.println("Reason : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}
}
