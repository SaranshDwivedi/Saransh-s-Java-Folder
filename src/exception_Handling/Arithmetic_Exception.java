package exception_Handling;
import java.util.Scanner;

class Arithmetic_Exception 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Main Starts");
		try
		{
			int c = a / b;
		}
		catch (ArithmeticException e)
		{	
			System.out.println("Exception Handled SucessFully");
			System.out.println("Reason : "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Main Ends");
	}
}
