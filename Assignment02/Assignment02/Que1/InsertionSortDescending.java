package com.assignment;

public class InsertionSortDescending {
	public static int insertionSortDescending(int[] arr) {
        int comparisons = 0; 

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

                       while (j >= 0) {
                comparisons++; 
                if (arr[j] < key) { 
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;                 }
            }
            arr[j + 1] = key;
        }

        return comparisons;     }

    public static void main(String[] args) {
        int[] array = {3,5,1,8,9,6};
        int comparisons = insertionSortDescending(array);

        System.out.println("Sorted array in descending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nNumber of comparisons: " + comparisons);
    }



}
