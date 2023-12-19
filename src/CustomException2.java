class SalaryException extends RuntimeException
{
	public String getMessage()
	{
		return "Salary Can Not Be Zero";
	}
}

class Employee
{
	String name;
	int sal;

	Employee(String name, int sal)
	{
		this.name = name;

		if(sal>0)
		{
			this.sal = sal;
		}
		else
		{
			throw new SalaryException();
		}
	}
}

class CustomeException
{
	public static void main(String [] args)
	{
		Employee e1 = new Employee("Ram",80000);
		Employee e2 = new Employee("Shyam",-80000);

		System.out.println(e1);
		System.out.println(e2);
	}
}