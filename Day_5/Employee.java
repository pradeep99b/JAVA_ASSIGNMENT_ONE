package Practice.Codes.Day_5;

public class Employee {
	
	int empNumber;
	String name;
	String department;
	float salary;
	
	public void enterDetails(int empNumber, String name, String department, float salary) {
		
		this.empNumber = empNumber;
		this.name = name;
		this.department = department;
		this.salary = salary;
		
		
	}
	
	public void enterDetails(String name, String department, float salary, int empNumber) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.empNumber = empNumber;
		
		
	}
	
	public void enterDetails( String department, float salary, int empNumber, String name) {
		
		
		this.department = department;
		this.salary = salary;
		this.empNumber = empNumber;
		this.name = name;
		
		
	}
	
	public void enterDetails(float salary, int empNumber, String name, String department) {

		this.salary = salary;
		this.empNumber = empNumber;
		this.name = name;
		this.department = department;
		
		
	}
	
	public void showDetails() {
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Employee Number is : "+this.empNumber);
		System.out.println("Employee Name is : "+this.name);
		System.out.println("Employee Department is : "+this.department);
		System.out.println("Employee Salary is : "+this.salary);
		
		System.out.println("------------------------------------------------");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		
		emp1.enterDetails(1,"Pradeep","R&D",65000.0f);
		emp1.showDetails();
		
		emp2.enterDetails("Shubham","Developer",50000.0f,2);
		emp2.showDetails();
		
		emp3.enterDetails("Management",34788.9f,3,"Divyanshu");
		emp3.showDetails();
		
		emp4.enterDetails(467468.0f,4,"Girish","Cyber");
		emp4.showDetails();
		
		

	}

}
