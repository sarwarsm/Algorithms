package CSCI2020;

import java.util.LinkedList;
import java.util.Random;

public class Driver {
	public static void main(String []args) {
		int arr[] = { 10, 26, 131, 49, 150, 68, 72, 85};
		Tree tree = new Tree();
		
		for(int val: arr) {
			tree.addNode(new Node(null,null,new Data(val)));
		}
		
		System.out.println("Tree nodes: ");
		LinkedList<Node> treeNodeList = tree.getTreeNodeList();
		for(Node node: treeNodeList ) {
			System.out.printf("%d,", node.getData().getValue());
		}
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 26, 131, 49, 150, 68, 72, 85};
		FibonacciSearch fbSearch = new FibonacciSearch();
		System.out.println("Fionacci Search Result: " + fbSearch.fibonaccianSearch(arr, 76, arr.length));

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
		
		QuickSort qSort = new QuickSort();
		qSort.quickSort(B, 1, B.length);
		System.out.printf("\nSorted Array using Quick Sort: ");
		for(int i = 0; i < B.length; i++) {
			System.out.print(i < (B.length - 1)? B[i] + ",": B[i]);
		}
		System.out.println();
		
		MergeSort mSort = new MergeSort();
		mSort.mergeSort(A, 1, A.length);

		System.out.printf("\nSorted Array using Merge Sort: ");
		for(int i = 0; i < A.length; i++) {
			System.out.print(i < (A.length - 1)? A[i] + ",": A[i]);
		}
		System.out.println();
		
		System.out.println("Fionacci Search Result for " + A[A.length - A.length/7] + " Index: " + fbSearch.fibonaccianSearch(A, A[A.length - A.length/7], A.length));
		
		BinarySearch bSearch = new BinarySearch();
		System.out.println("Binary Search Result for " + A[A.length - A.length/7] + " Index: " + bSearch.binarySearch(A, A[A.length - A.length/7] ));

	}

}
