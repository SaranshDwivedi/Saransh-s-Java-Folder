import java.util.Scanner;
public class PAlindrom11 {
	

	class Fibionacci 
	{
		public static void main(String[] args) 
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter that number : ");
			int a = 0;

			int b = 1; 

			for (int i =1;i<20;i++)
			{
				int c = a+b;
				a = b;
				b = c;
			}
			
			//System.out.println("Hello World!");
		}
	}

}
