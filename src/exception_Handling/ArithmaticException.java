package exception_Handling;
import java.util.Scanner;
public class ArithmaticException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Give me 1st Number : ");
		int a = s.nextInt();
		
		System.out.print("Give me 2nd Number : ");
		int b = s.nextInt();
		
		try
		{
			int c = a / b;
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
	}

}
