package Object_Class_Methods;

class Studenthc
{
	String name;
	int marks;
	char gender;			//instance variable

	Studenthc(String name , int marks , char gender)
	{
		this.name = name;
		this.marks = marks;
		this.gender = gender;		//constructor = to intialize object
	}
	public boolean equals(Object o)
	{
		Studenthc temp = (Studenthc)o;			//DownCasting 
		if (this.name == temp.name && this.marks == temp.marks && this.gender == temp.gender)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashcode()
	{
		int hashcode = name.hashCode() + ((Integer) marks).hashCode() + ((Character) gender).hashCode();
		return hashcode;
	}
}

class HashCodeStudent
{
	public static void main(String[] args) 
	{
		Studenthc s1 = new Studenthc("Bon Clay",26,'M');
		Studenthc s2 = new Studenthc("BalteLemor",17,'M');
		Studenthc s3 = new Studenthc("Hancock",25,'F');
		Studenthc s4 = new Studenthc("Mr 3",31,'M');
		Studenthc s5 = s3;

		System.out.println(s1.hashcode());
		System.out.println(s2.hashcode());
		System.out.println(s3.hashcode());
		System.out.println(s4.hashcode());
		System.out.println(s5.hashcode());

	}
}
