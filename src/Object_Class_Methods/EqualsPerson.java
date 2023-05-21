package Object_Class_Methods;

class Person 
{
  String name; 
  int age;                        //instance variable = 
  
	Person(String name , int age)
	{
	  this.name = name;
	  this.age = age;          //Constructor = to initialize the object
	}
	public boolean equals(Object o)
	{
		Person temp = (Person)o;	//DownCasting with Object Class
		if (this.name == temp.name && this.age == temp.age)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
 class EqualsPerson 
 {
	public static void main(String[] args) 
	{
		Person p1 = new Person("Trafalgar",28);
		Person p2 = new Person("Kid", 27);
		Person p3 = new Person("Monkey D. Luffy",25);
        Person p4 = p1;

        System.out.println(p1.equals(p4));
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p1));
		System.out.println(p3.equals(p4));
	}
}
