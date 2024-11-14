package com.assignment;

public class LinearSearch {
	public static int findLastOccurrence(int arr[], int key) {
		int lastIndex = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}
	
	public static void main(String[] args) {
		int[]array = {2,3,4,5,3,6,3,1};
		int key = 1;
		
		int index = findLastOccurrence(array, key);
		
		if(index != -1) {
			System.out.println("Last Occurrence of " +key+" is at index: "+index);
		}else {
			System.out.println(key + "not found in the array ");
			
		}
	}
}

