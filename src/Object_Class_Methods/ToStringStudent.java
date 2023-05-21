package Object_Class_Methods;
class Student 
{
	String name;
	int marks;

	Student(String name , int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return "[Student Name : " +name+", Obtained Marks : "+marks+"]";
	}
}


class ToSringStudent
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Aditya",86);
		Student s2 = new Student("Shaggy",45);
		Student s3 = new Student("Mohan",67);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}
