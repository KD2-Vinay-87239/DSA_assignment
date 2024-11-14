package com.assignment;

import java.util.Scanner;

public class LinearSearchAlgo {
	public static int linerSearch(int[] arr, int key, int occurance) {
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				element++;
				if (element == occurance)
					return i;
			}
		}
		return element;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 45, 77, 7, 85, 21, 35, 45, 11, 8, 99, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to find: ");
		int key = sc.nextInt();

		System.out.print("Enter the occurence: ");
		int occurance = sc.nextInt();
		int count = linerSearch(arr, key, occurance);
		if (count != 0)
			System.out.println("The number '" + key + "' is present at index: '" + count + "'");
		else
			System.out.println("The number '" + key + "' is not present");
		sc.close();
	}
}
