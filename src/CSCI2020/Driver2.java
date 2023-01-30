package CSCI2020;

import java.util.Random;

public class Driver2 {

	public static void main2(String[] args) {
		Random rand = new Random();
		int arraySize = 100;
		int A[] = new int[arraySize];
		int B[] = new int[arraySize];
		for(int i = 0; i < A.length; i++ ) {
			A[i] = (int)(rand.nextDouble()*100000);
			B[i] = A[i];
		}
		System.out.printf("\nOriginal Array: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(i < (A.length - 1)? A[i] + ",": A[i]);
		}
		System.out.println();
		
		
		MergeSort mSort = new MergeSort();
		mSort.mergeSort(A, 1, A.length);

		System.out.printf("\nSorted Array using Merge Sort: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(i < (A.length - 1)? A[i] + ",": A[i]);
		}
		System.out.println();
		
		BinarySearch bSearch = new BinarySearch();
		System.out.println("Binary Search Result for " + A[A.length - A.length/7] + " Index: " + bSearch.binarySearch(A, A[A.length - A.length/7] ));

	}

}
