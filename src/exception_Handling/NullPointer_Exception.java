package exception_Handling;

class NullPointer_Exception 
{
	public static void main(String[] args) 
	{
		int arr [] = null;
		
		try
		{
			System.out.println(arr[2]);
		}
		catch (NullPointerException e)
		{	
			System.out.println("NPE handled Sucessfully");
			System.out.println("Reason : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}
}
