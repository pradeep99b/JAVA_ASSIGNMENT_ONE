import java.util.Scanner;

class Three{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a = sc.nextDouble();
		System.out.println("Enter the other number: ");
		int b = sc.nextInt();
	
		System.out.println("Enter the operation you want to perform");
		char c = sc.next().charAt(0);
		int sol;
		
		switch(c){
			
			case '+':
				sol = a+b;
				System.out.println("Answer: "+sol);
				break;

			case '-':
				sol = a-b;
				System.out.println("Answer: "+sol);
				break;
			case '*':
				sol = a*b;
				System.out.println("Answer: "+sol);
				break;
			case '/':
				float so = a/b;
				System.out.println("Answer: "+so);
				break;
			default :
				System.out.println("Symbol not allowed");
				break;
		}
	}
}

				
		