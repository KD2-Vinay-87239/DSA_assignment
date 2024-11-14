package com.assignment;

import java.util.Arrays;

public class SelectionSort {
	public static int selectionSort(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 45, 77, 85, 21, 35, 11, 8, 99, 7 };
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		System.out.println();
		int comparisions = selectionSort(arr);
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		System.out.println("Comparisions: " + comparisions);
	}

}

