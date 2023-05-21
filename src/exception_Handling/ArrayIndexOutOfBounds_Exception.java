package exception_Handling;

class ArrayIndexOutOfBounds_Exception 
{
	public static void main(String[] args) 
	{
		int arr [ ] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Main Starts");
		try
		{
			System.out.println(arr[11]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("AIOOBE handled SucessFully");
			System.out.println("Reason : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}
}
