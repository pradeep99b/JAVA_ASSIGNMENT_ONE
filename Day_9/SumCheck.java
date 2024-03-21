package Practice.Codes.Day_9;

import java.util.Scanner;

class Check{

	public static void enter_Array(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i <arr.length ; i++) 
			arr[i]= sc.nextInt();	
		
	}
	


	public static void display_array(int[] arr) {

		System.out.print("The Elements of the array are : ");
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		
		System.out.print("\n");

	}

	public static void show_Pairs(int[] arr, int sum) {

		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}

			}
		}

	}

}

public class SumCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		Check.enter_Array(arr);
		Check.display_array(arr);
		System.out.print("Enter the sum to be checked : ");
		int sum = sc.nextInt();
		Check.show_Pairs(arr, sum); 
		sc.close();

	}

}
