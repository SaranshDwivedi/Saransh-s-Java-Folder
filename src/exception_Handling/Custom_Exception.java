package exception_Handling;


		class SalaryException extends RuntimeException
		{
			public String getMessage()
			{
				return "Salary can't be less than Zero";
			}
		}

	class Employee
	{
		String name;
		int salary;
	
		Employee(String name , int salary)
		{
			this.name = name;
			if(salary > 0)
			{
			this.salary = salary;
			}
			else
			{
				throw new SalaryException();
			}
		}
		public String toString()
		{
			return "[ Name : "+name+" , Salary : " +salary+"]";
		}
	}
	class Custom_Exception
	{
		public static void main(String [] args)
	{
			Employee e1 = new Employee("Ram" , 80000 );
			Employee e2 = new Employee("Mohan" , -20000);
			
			System.out.println(e1);
			
			System.out.println(e2);
	}
	}
	