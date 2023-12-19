package PracticeLast;

public class PowerOfNum {

	public static void main(String[] args) {
		
		int base = 2;
		
		int power = 3;
		
		int res = 1;
		
		for(int i = 1; i<=power; i++)
		{
			res = base * res;
		}
		System.out.println(res);
	}

}
