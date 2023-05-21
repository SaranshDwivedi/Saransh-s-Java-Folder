package Object_Class_Methods;

class Shoe
{
	String brand;
	int price;
	double size;
	char val;						//instance variable

	Shoe(String brand , int price , double size , char val)
	{
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.val = val;				//constructor = is use to initialize an object
	}
		//@overriding
		public boolean equals(Object o)			//overriding equals method to compare the states of object not instance or address.
		{
			Shoe temp = (Shoe) o;
			if (this.brand == temp.brand && this.price == temp.price && this.size == temp.size && this.val == temp.val)
			{
				return true;
			}
			else
			{
				return false;
			}
		//@overriding
			
		public int hashCode()	//overriding hashcode method to get the "Unique Integer Number of each object creation".
		{
			int hashcode1 = brand.hashCode()+((Integer)price).hashCode()+((Double)size).hashCode()+((Character)val).hashCode();
			return hashcode1;
		}
		}
 }

 class HashCodeShoe
 {
	public static void main(String[] args) 
	{
		Shoe s1 = new Shoe("Air Jorden" , 20 ,9.5 ,'H');
		Shoe s2 = new Shoe("Skechers" ,17 , 10.5 , 'H');
		Shoe s3 = new Shoe("Adidas" , 9 , 11.0 , 'G');
		Shoe s4 = s2;

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
