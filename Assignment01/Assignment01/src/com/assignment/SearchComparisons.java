package com.assignment;

import java.util.Arrays;

public class SearchComparisons {
	
	public static int linearSearch(int arr[], int key) {
		int comparisons = 0;
		for(int i = 0; i<arr.length; i++) {
			comparisons++;
			if(arr[i] == key) {
				return comparisons;
			}
		}
		return comparisons;
	}
	
	public static int binarySearch(int arr[], int key) {
		int comparisons = 0;
		int left = 0;
		int right = arr.length -1;
		
		while(left <= right) {
			comparisons++;
			int mid = left + (right - left)/2;
			
			if(arr[mid] == key) {
				return comparisons;	
			}else if(arr[mid] < key) {
				left = mid +1;
			}else {
				right = mid -1;
			}
		}
		return comparisons;
		
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int key = 7;
		
		int linearComparisons = linearSearch(arr, key);
		System.out.println("Linear Search: ");
		System.out.println("Number of Comparisons: " + linearComparisons);
		
		
		int binaryComparisons =  binarySearch(arr, key);
		System.out.println("Binary Search:");
		System.out.println("Number of Comparisons: " + binaryComparisons);
	}
}
