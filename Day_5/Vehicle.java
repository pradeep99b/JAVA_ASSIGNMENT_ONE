package Practice.Codes.Day_5;

import java.util.Scanner;

public class Vehicle {
	
	String regNumber;
	String modelNumber;
	String manufacturer;
	
	static Scanner sc = new Scanner(System.in);
	public void enterDetails() {
		
		
		System.out.print("Enter the Registeration Number : ");
		this.regNumber = sc.next();
		
		System.out.print("Enter the Model Number : ");
		this.modelNumber = sc.next();
		
		System.out.print("Enter the Manufacturer : ");
		this.manufacturer = sc.next();
		
	}
	
	public void enterDetails(String name1) {
		
		
		
		this.regNumber = name1;
	
		System.out.print("Enter the Model Number : ");
		this.modelNumber = sc.next();
		
		System.out.print("Enter the Manufacturer : ");
		this.manufacturer = sc.next();
		
	}
	
	public void enterDetails(String name1, String name2) {
		
		
		
		this.regNumber = name1;

		this.modelNumber = name2;
		
		System.out.print("Enter the Manufacturer : ");
		this.manufacturer = sc.next();
		
	}
	
	public void enterDetails(String num, String name1, String name2) {
		
		this.regNumber = num;
		this.modelNumber = name1;
		this.manufacturer = name2;
		
	
	}
	
	public void showDetails() {
		
		System.out.println("---------------------------------------------------------------");


		System.out.println("The Registeration Number is : "+this.regNumber);
		
		System.out.println("The Model Number is : "+this.modelNumber);
		
		System.out.println("The Manufacturer is : "+this.manufacturer);
		
		System.out.println("---------------------------------------------------------------");


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle one = new Vehicle();
		Vehicle two = new Vehicle();
		Vehicle three = new Vehicle();
		Vehicle four = new Vehicle();
		
		one.enterDetails();
		one.showDetails();
		
		two.enterDetails("MV08781");
		two.showDetails();
		
		three.enterDetails("BDJ36794","BSJJ3499");
		three.showDetails();
		
		four.enterDetails("SHDK2739","BSJ37902","MARUTI");
		four.showDetails();
	}

}
