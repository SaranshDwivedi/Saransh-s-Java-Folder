package Incremental_Decremental;

public class Post_Incremental {

	public static void main(String[] args) {
		
		int a = 100;
		
		int b = a;
		
		b = a++;		
		
		System.out.println(a);	// use  = 100 and then updating = 101
		
		System.out.println(b);	//used 100 only not updated = 101

	}

}
