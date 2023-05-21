
public class Count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = " Hello Java";
			
			int count = 0;
			
			for(int i = 0; i<s.length(); i++)
			{
				if(i==0 && s.charAt(i)!=' ')   		//for the 1st word not to be space
				{
					count++;
				}
				else if(i<=s.length()-1 && s.charAt(i)!=' ' && s.charAt(i-1)==' ')			//for middle word space should not be there
				{
					count++;
				}
				
			}
			System.out.println(count);
	}

}
