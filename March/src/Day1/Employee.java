package Day1;

public class Employee {

	
		int salary;
		int bonus;
		
		void calculateSalary()
		{
			
			int totalsalary = salary + bonus;
			
			System.out.println("Salary of employee"+totalsalary);
			
			
		}
		
		public Employee() {
			salary=2000;
			bonus=1000;
		}
		
		  
		
		int calculateSalary1()
		
		{
			
			int totalsalary = salary + bonus;
			
			return totalsalary;
		}

	}


