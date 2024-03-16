package Practice.Codes.Day_5;

import java.util.Scanner;

public class Student {
	
	String name;
	int rollNumber;
	String fatherName;
	
	public void showDetails() {
		
		System.out.println("Name : "+this.name);
		System.out.println("Roll Number : "+this.rollNumber);
		System.out.println("Father's Name : "+this.fatherName);
	}
	
	public void enterDetails() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name : ");
		this.name = sc.next();
		
		System.out.print("Enter Roll Number : ");
		this.rollNumber = sc.nextInt();
		
		System.out.print("Enter Father's Name : ");
		this.fatherName = sc.next();
		
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student one = new Student();
		one.enterDetails();
		one.showDetails();
	}

}
