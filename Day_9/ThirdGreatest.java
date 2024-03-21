package Practice.Codes.Day_9;

import java.util.Scanner;

class Comparison {

	public static void enter_Array(int[] arr) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

	}

	public static int findThirdMax(int[] arr) {

		int max1 = arr[0];
		int max2 = arr[1];
		int max3 = arr[2]; 
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>=max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]>=max2) {
				max3 = max2;
				max2 = arr[i];
			}
			else
				max3 = arr[i];
		
	}
		return max3;

	}
}

public class ThirdGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array  : ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		Comparison.enter_Array(arr);
		int max = Comparison.findThirdMax(arr);
		System.out.println(max);

	}

}
