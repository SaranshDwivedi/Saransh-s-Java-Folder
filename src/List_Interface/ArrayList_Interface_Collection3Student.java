package List_Interface;

import java.util.ArrayList;

class Studental 
{
	String name;	
	int marks;
	
	Studental(String name , int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "[Name : "+name+" ,  Marks : "+marks+"]";
	}
}
class	ArrayList_Interface_Collection3Student
{
	public static void main(String[] args) 
	{
		ArrayList<Studental> al = new ArrayList<Studental>();
		
		Studental s1 = new Studental("Newman", 86);
		Studental s2 = new Studental("Gandaulf",98);
		Studental s3 = new Studental("James",45);

		al.add(s1);
		al.add(s2);
		al.add(s3);

		for (Studental s : al)
		{
			System.out.println(s);
		}		
	}
}
