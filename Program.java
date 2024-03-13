import java.util.Scanner;

class Program{

	
	public static void main( String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the grades in percentage");
		float per = sc.nextFloat();		

		if( per >= 90)
			System.out.println("Congratulation you have got an A grade");
		else if( per >= 70)
			System.out.println("Congratulation you have got B grade");
		else if( per >= 50 )
			System.out.println("Congratulation you have got C grade");
    		else if(per >= 30)
			System.out.println("Congratulation you have got D grade");
		else
			System.out.println("You have failed the examination");
		
	}

}