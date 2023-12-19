package PracticeLast;

class Employee
{
	void work()
	{
		System.out.println("Employees are Working");
	}
}
class Dev extends Employee
{
	void work()
	{
		System.out.println("Developing the App");
	}
}
class Testers extends Employee
{
	void work()
	{
		System.out.println("Testing the App");
	}
}
class Manager extends Employee
{
	void work()
	{
		System.out.println("Managing the office");
	}
}
public class RunTimePoliMorphismEmployee 
{
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Dev d = new Dev();
		Testers t = new Testers();
		Manager m = new Manager();
		
		d.work();
		t.work();
		m.work();
		
		// UP-CASTING
		Employee e1 = new Dev();
		e1.work();
		
		Employee e2 = new Testers();
		e2.work();
		
		Employee e3 = new Manager();
		e3.work();
		
		// DOWN-CASTING
		Dev d1 = (Dev) e1;
		d1.work();
		
		Testers t1 = (Testers) e2;
		t1.work();
		
		Manager m1 = (Manager) e3;
		m1.work();
		
	}
}