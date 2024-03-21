package Practice.Codes.Day_9;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the series : ");
		int size = sc.nextInt();
		
		for(int i=1;i<=size;i++)
			if(i%2==0)
				System.out.print((int)Math.pow(i, 2)+" ");
			else
				System.out.print((int)Math.pow(i, 3)+" ");
		sc.close();


	}

}
