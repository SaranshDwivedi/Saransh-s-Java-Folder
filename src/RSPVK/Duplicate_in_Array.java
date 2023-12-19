package RSPVK;

public class Duplicate_in_Array {

	public static void main(String[] args) {
		
		int a []  = {1,1,2,3,4,5,5,6,6};
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("at index "+a[i]+", we found a duplicate value.");
				}
			}
		}
	}
}
