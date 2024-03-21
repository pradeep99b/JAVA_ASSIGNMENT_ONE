package Practice.Codes.Day_9;

import java.util.Scanner;

class ReverseDec{

	public static void enter_Array(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i <arr.length ; i++) 
			arr[i]= sc.nextInt();	
		
	}
	
	public static int[] display_reverse(int[] arr1, int[] arr2) {
		
		int index = 0;
		for(int i=arr1.length-1;i>=0;i--) {
			arr2[index]=arr1[i];
			index++;
		}
		return arr2;
	}
	
	public static void display_Array(int[] arr) {
		System.out.print("The elements of array : ");

		for (int i = 0; i <arr.length ; i++) 
			System.out.print(arr[i]+" ");

	}

}



public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array  : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int reverse[] = new int[size];
		ReverseDec.enter_Array(arr);
		ReverseDec.display_Array(ReverseDec.display_reverse(arr,reverse));
		sc.close();
	}

}
