package CSCI2020;

public class MergeSort {
	
	public void mergeSort(int A[], int p, int r) {
		int q;
		
		if(p < r) {
			q = (p+r)/2;
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
	}
	
	public void merge(int A[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - (q+1) + 1;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		int i = 1, j = 1;
		
		int ndx;
		for(ndx = 0; ndx < n1; ndx++) {
			L[ndx] = A[ndx + p - 1];
		}
		L[ndx] = 0x7FFFFFFF;
		
		for(ndx = 0; ndx < n2; ndx++) {
			R[ndx] = A[ndx + q];
		}
		R[ndx] = 0x7FFFFFFF;
		
		for(int k = p; k <= r; k++) {
			if(L[i-1] <= R[j-1]) {
				A[k-1] = L[i-1];
				i++;
			}else {
				A[k-1] = R[j-1];
				j++;
			}
		}
	}
}
