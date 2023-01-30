package CSCI2020;

public class FibonacciSearch {
	/* Returns index of x if present,  else returns -1 */

	public int fibonaccianSearch(int arr[], int x, int n){
	    /* Initialize fibonacci numbers */
	    int fbM2 = 0;   // (m-2)'th Fibonacci number
	    int fbM1 = 1;   // (m-1)'th Fibonacci number
	    int fbM = fbM2 + fbM1;  // m'th Fibonacci

	    // Marks the eliminated range from front
	    int offset = -1;

	    /* fbM is going to store the smallest Fibonacci number greater than or equal to n */
	    while (fbM < n){
			fbM2 = fbM1;
			fbM1 = fbM;
			fbM  = fbM2 + fbM1;
	    }
	    /* while there are elements to be inspected. Note that we compare arr[fbM2] with x. When fbM becomes 1, fbMm2 becomes 0 */
	    while (fbM > 1) {
			// Check if fbMm2 is a valid location
			int i = Math.min(offset+fbM2, n-1);
	
			/* If x is greater than the value at index fbMm2, cut the subarray array from offset to i */
			if (arr[i] < x){
			    fbM  = fbM1;
			    fbM1 = fbM2;
			    fbM2 = fbM - fbM1;
			    offset = i;
			}else if (arr[i] > x){ /* If x is smaller */
			    fbM  = fbM2;
			    fbM1 = fbM1 - fbM2;
			    fbM2 = fbM - fbM1;
			}else {
				return i; /* element found. return index */
			}
	    }

	    if(fbM1 > 0 && (arr[offset+1] == x))     /* comparing the last element with x */
	    	return offset+1;
	    
	    return -1; /*element not found. return -1 */
	}
}
