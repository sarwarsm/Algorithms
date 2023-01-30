package CSCI2020;

public class QuickSort {
	public void quickSort(int A[], int p, int r) {
		int q;
		if(p < r) {
			q = partition(A,p,r);
			quickSort(A, p, q);
			if(q>=p)
				quickSort(A, q+1, r);
		}
	}
	
	private int partition(int A[], int p, int r) {
		int partitionPoint = -1;
		int x = A[p-1];
		int i = p;
		int j = r;
		boolean loop = true;
		boolean swapped = false;

		while(loop) {
			for(;(j-1) >= 0 && A[j-1] >= x;j--);
			for(;(i-1) >= 0 && A[i-1] < x;i++);
			if(i<j) {
				int temp = A[i-1];
				A[i-1] = A[j-1];
				A[j-1] = temp;	
				swapped = true;
			}else {
				if(swapped)
					partitionPoint = j;
				else
					partitionPoint = j + 1;
				loop = false;
			}
		}
		return partitionPoint;
	}
}