import java.util.Scanner;

class five{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		char c = sc.next().charAt(0);
		
		if( (c>='A'&&c<='Z') || (c>='a'&&c<='z') ){
		
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' ||c=='E'||c=='I'||c=='O'||c=='U')
				System.out.println("Vowel");		

			else
				System.out.println("Consonant");
		}
		else
			System.out.println("Error");
		
	}
}
	