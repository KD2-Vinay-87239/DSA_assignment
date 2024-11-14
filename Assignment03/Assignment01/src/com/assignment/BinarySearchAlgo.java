package com.assignment;

import java.util.Scanner;
public class BinarySearchAlgo {

	public static int binarySearch(int[] arr, int key) {
		int left = 0, right = arr.length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			else if (key > arr[mid])
				right = mid - 1;
			else if (key < arr[mid])
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 121, 99, 85, 75, 45, 35, 21, 20, 11, 8, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find: ");
		int key = sc.nextInt();
		int count = binarySearch(arr, key);
		if (count != -1)
			System.out.println("The number '" + key + "' is present at index: '" + count + "'");
		else
			System.out.println("The number '" + key + "' is not present");
		sc.close();
	}

}

