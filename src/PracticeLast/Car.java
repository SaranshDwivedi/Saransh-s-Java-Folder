package PracticeLast;

//ConstructorOverLoading

class Car
{
	String Model;
	int Milage;
	double rate;

	Car()
	{
	}
	Car(int Milage)
	{
		this.Milage = Milage;
	}
	Car(String Model , double rate)
	{
		this.Model = Model;
		this.rate = rate;
	}	
	Car(String Model , int Milage , double rate)
	{
		this.Model = Model;
		this.Milage = Milage;
		this.rate = rate;
	}
	
	public void display()
	{
		System.out.println("- - - - Car Details- - - -");
		System.out.println("Model of our Car : "+Model);
		System.out.println("Milage of Car : "+Milage);
		System.out.println("Price of our Car : "+rate);
	}

	public static void main(String [] args)
	{
		Car c = new Car("Mustang" , 2.65);
		Car c1 = new Car(12);
		Car c2 = new Car("Lamburghini" , 7 , 12.89);

		c.display();
		c1.display();
		c2.display();
		c2.display();
	}		
}