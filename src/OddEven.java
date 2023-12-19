import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		//System.out.println();
		
		System.out.print("Give me 1st Starting Value ");
		int a = s.nextInt();
		
		System.out.print("Give me Ending Value ");
		int b = s.nextInt();

		for(int i = a; i <= b; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
