package Day1;	

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee  Rajagopal;
	Employee gopal;
		
		Rajagopal = new Employee();
		
		Rajagopal.salary=6000;
		Rajagopal.bonus=10000;
		
		Rajagopal.calculateSalary();
		
		
		 gopal  = new Employee();
		
		 gopal.salary=2000;
		gopal.bonus=8000;
		
		
		int totalsalary = gopal.calculateSalary1();
		
		System.out.println("gopal salary is" + totalsalary);
		
		
		

	}

}
