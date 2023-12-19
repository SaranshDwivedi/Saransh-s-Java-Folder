package PracticeLast;

class ConstructorOverLoadingStudent
{
	String name;
	int rollnum;

	ConstructorOverLoadingStudent()
	{
	}
	
	ConstructorOverLoadingStudent(String name)
	{
		this.name = name;
	}

	ConstructorOverLoadingStudent(String name , int rollnum)
	{
		this.name = name;
		this.rollnum = rollnum;
	}
	
	void display()
	{
		
		System.out.println("["+"Name of Student : "+name+" , Roll Number : "+rollnum+"]");
	}
	

	public static void main (String [] args)
	{
		ConstructorOverLoadingStudent s1 = new ConstructorOverLoadingStudent("Ram" , 101);
		
		ConstructorOverLoadingStudent s2 = new ConstructorOverLoadingStudent("David" , 109);
		
		ConstructorOverLoadingStudent s3 = new ConstructorOverLoadingStudent("Keshav");

		s1.display();
		
		s2.display();
		
		s3.display();
	}
 
}