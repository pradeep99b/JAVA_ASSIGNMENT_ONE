package Practice.Codes.Day_9;
import java.util.Scanner;

public class Order {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.print("Enter the elements of the array : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int ascending=0;
		int descending=0;
		int equal = 1;
		for(int i=0;i<size-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				equal = 0;
				if(arr[i]>=arr[i+1])
					descending=1;
				else if(arr[i]<=arr[i+1])
					ascending=1;
			}
		}
		if(equal==1)
			System.out.println("Equal");
		else if(ascending==0&&descending==1)
			System.out.println("Descending");
		else if(ascending==1&&descending==0)
			System.out.println("Ascending");
		else
			System.out.println("Random");
		
	}

}
