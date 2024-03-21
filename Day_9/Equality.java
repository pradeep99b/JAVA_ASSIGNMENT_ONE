package Practice.Codes.Day_9;

import java.util.Scanner;

class Declare{

	int arr[];
	int k;

	public static void enter_Array(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i <arr.length ; i++) 
			arr[i]= sc.nextInt();	
		
	}
	
	public static int comparison(int[] arr1, int[] arr2) {
		
		int flag = 1;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				flag = 0;
				break;
			}
			
		}
		return flag;
	}

}

class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of the Array  : ");
		size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];

		Declare.enter_Array(arr1);
		Declare.enter_Array(arr2);
		sc.close();
		int flag = Declare.comparison(arr1,arr2);
		if(flag==0) 
			System.out.println("They are different");
		else
			System.out.println("They are same");
	}
}
