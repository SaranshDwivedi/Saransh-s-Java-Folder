package Object_Class_Methods;

class Students 
{
	String name;
	int age;

	Students(String name, int age)
    {
		this.name = name;
		this.age = age;
    }

	//@overriding
	public String toString()
	{
		return"[Full Name : "+name+", Age : "+age+"]";
	}
}
class ToStringStudent1
{
	public static void main(String[] args) 
	{
		Students s1 = new Students("Hiyori", 17);
        Students s2 = new Students("Mihawk",14);
        Students s3 = new Students("Zoro",10);
		System.out.println(s1);  //when we call s1 , always directly s1.toString() called 
		System.out.println(s2);  //s2.toString()
		System.out.println(s3.toString());
	}
}
