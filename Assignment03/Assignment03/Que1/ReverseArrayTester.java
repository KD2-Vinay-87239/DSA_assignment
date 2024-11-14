package com.assignment;

public class ReverseArrayTester {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		ReverseArray stack = new ReverseArray(array.length);
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = stack.pop();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
