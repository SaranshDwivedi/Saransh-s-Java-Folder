package exception_Handling;

public class ExceptionCondition {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try
		{
			int c = a / b;
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		catch (ArithmeticException e)
//		{
//			System.out.println(e.getMessage());
//		}
	}

}
