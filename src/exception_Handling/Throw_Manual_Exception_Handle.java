package exception_Handling;

class Throw_Manual_Exception_Handle 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 0;

		//c = a/b
		if (b==0)
		{
			throw new ArithmeticException ("Manually");
		}
		else
		{
			int c = a/b;
			System.out.println(c);
		}
	}
}
