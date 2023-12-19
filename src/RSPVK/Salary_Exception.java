package RSPVK;

public class Salary_Exception extends RuntimeException
{
	@Override
	public String getMessage()
	{
		return "Salary can not be Zero or Less than Zero";
	}
}
class Employee
{
	String name;
	int salary;
	
	Employee(String name, int salary)
	{
		this.name = name;

		if(salary > 0)
		{
			this.salary = salary;
		}
		else
		{
			throw new Salary_Exception();
		}
	}
	public String toString()
	{
		return "Name of the Employee : "+name+", Package : "+salary;
	}
}
class EmpDepo
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		Employee e1 = new Employee("Saransh", 100000);
		Employee e2 = new Employee("Saransh Dwivedi", -1000000);

		System.out.println(e1);
		System.out.println("wait for it");
		System.out.println(e2);
		System.out.println("Main Ends");
	}
}
