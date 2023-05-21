package Object_Class_Methods;

class StudentE 
{
	String name;
	int age;

	StudentE(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object o)
	{
		StudentE temp = (StudentE)o;

		if (temp.name == this.name && temp.age == this.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

	class EqualsStudentE
	{
	public static void main(String[] args) 
	{
      StudentE s1 = new StudentE("Bon Clay",15);
	  StudentE s2 = new StudentE("Luffy",11);
	  StudentE s3 = new StudentE("Law",12);
	  StudentE s4 = s2;

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));      
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s2));
		System.out.println(s4==s2);
	}
}
