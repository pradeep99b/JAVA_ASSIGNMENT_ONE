package Practice.Codes.Day_9;

import java.util.Scanner;

class FindMaxMin {

	public static void enter_Array(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements of array : ");

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

	}

	public static int findMax(int[] arr) {

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}

public class MaxMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the Array  : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		FindMaxMin.enter_Array(arr);
		int max = FindMaxMin.findMax(arr);
		System.out.print("The maximum element is : " + max);
		System.out.print("\n");
		int min = FindMaxMin.findMin(arr);
		System.out.print("The minimum element is : " + min);
		sc.close();
	}

}
