package com.assignment;

import java.util.Arrays;

public class StreamOfIntegers {
	
	public static int findRank(int arr[], int x) {
		int rank = (int) Arrays.stream(arr).filter(num -> num <= x).count();
		return rank;
	}

	public static void main(String[] args) {
		int arr[] = {10,20,25,3,4,4,1};
		int x = 4;
		int rank = findRank(arr, x);
		System.out.println("Rank of" + x + "is: " + rank);
	}
}
