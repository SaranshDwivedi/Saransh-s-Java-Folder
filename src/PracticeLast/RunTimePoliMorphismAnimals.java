package PracticeLast;

class Animals
{
	void eats()
	{
		System.out.println("Animals are Eating");
	}
}
class Herbivorous extends Animals
{
	void eats()
	{
		System.out.println("Herbivorous are Eating the Grass");
	}
}
class Carnivorous extends Animals
{
	void eats()
	{
		System.out.println("Carnivorous are eating Meat");
	}
}
public class RunTimePoliMorphismAnimals 
{
	public static void main(String[] args) {
		
		Animals a = new Animals();
		Herbivorous h = new Herbivorous();
		Carnivorous c = new Carnivorous();
		a.eats();
		h.eats();
		c.eats();
		
		//UP-CASTING
		Animals a2 = new Herbivorous();
		a2.eats();
		Animals a3 = new Carnivorous();
		a3.eats();
		
		//Down-Casting
		Herbivorous h1 = (Herbivorous) a2;
		h1.eats();
		
		Carnivorous c1 = (Carnivorous) a3;
		c1.eats();
	}
}
