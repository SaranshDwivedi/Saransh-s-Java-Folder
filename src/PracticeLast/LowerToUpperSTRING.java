package PracticeLast;

public class LowerToUpperSTRING {
	public static void main(String[] args) {

		String s = "saransh";

		String es = "";

		for(int i = 0; i<s.length(); i++)
		{
			if(i%2==0)
			{
				es = es + (char).s.charAt(i)-32;
			}
			else
			{
				es = es + (char).s.charAt(i);
			}
		}
		System.out.println(es);
	}
}
