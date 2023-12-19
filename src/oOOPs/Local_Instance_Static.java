package oOOPs;

public class Local_Instance_Static {

		int  a = 10;		//Instance variable 
		
		static int b = 20;	//static variable
		
		void add()
		{
			int c;		//c is local variable for add()
			
			c = a + b;	//a , b are accessible because they are the global variables
			 
			System.out.println(c);
		}
		
		void mul()
		{
			int d = 30; 	//d is local variable for mul()
			
			//d = a+ b + c; // it will give compile time error . . .because c is local variable for add() , not for mul(). . in mul() it is not accessible
			
			int e = a + b + d;
			
			System.out.println(e);
		}
	
}
