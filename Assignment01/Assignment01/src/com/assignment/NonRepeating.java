package com.assignment;

public class NonRepeating {
	public static int linerSearch(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int count = linerSearch(arr);
		if (count != -1)
			System.out.println(count);
		else
			System.out.println("The number  is not present");

	}
}
