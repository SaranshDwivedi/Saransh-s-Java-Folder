package oOOPs;

class Constructor_chaining {
	int a;
	String s;
	
	Constructor_chaining()
	{
		
	}

	Constructor_chaining(int a)
	{
		this.a = a;
	}
	
	Constructor_chaining(int a , String s)
	{
		this(a);
		this.s = s;
	}
	
}
