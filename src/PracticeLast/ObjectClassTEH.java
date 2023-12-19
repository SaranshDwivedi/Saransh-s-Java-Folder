package PracticeLast;

class Student
{
	String name;
	int age;
	
	Student(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "[Name of Student : "+name+"  Age : "+age+"]";
	}
	
	public boolean equals(Object s)
	{
		Student temp = (Student) s;
		if(temp.name == this.name && temp.age == this.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		int hashcode1 = name.hashCode()+((Integer)age).hashCode();
		
		return hashcode1;
	}
	
}
	class ObjectClassTEH
	{
	public static void main(String [] args)
	{
		Student o = new Student("David" , 25);
		Student o1 = new Student("Rubin" , 27);
		Student o2 = new Student("Cloe" , 28);
		Student o3 = new Student("Joseph" , 29);
		Student o4 = new Student("David" , 25);
		
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
		
		System.out.println(o==o1);
		System.out.println(o==o2);
		System.out.println(o==o3);
		System.out.println(o1==o2);
		System.out.println(o2==o3);
		System.out.println(o==o);
		System.out.println(o==o4);
		
		System.out.println(o.equals(o4));
		System.out.println(o.hashCode());
		System.out.println(o4.hashCode());
		System.out.println(o==o4);
		
		
	}
}
