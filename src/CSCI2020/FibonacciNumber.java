package CSCI2020;

public class FibonacciNumber {

	// n >= 1
	public long fibOpt(int n, long fibMem[]){
		long sum = 0l;
		if(n < 0)
			return -1;
		else if((n==1) || (n==0))
			return n;
		else if(fibMem[n-1] == -1){
			sum = fibMem[n] = fibOpt(n-1, fibMem) + fibOpt(n-2, fibMem);
		}else{
			sum = fibMem[n];
		}
		return sum;
	}

	public long fib(int n){
		long sum = 0;
		if(n < 0)
			return -1;
		else if((n==1) || (n==0))
			return n;
		else {
			sum = fib(n-1) + fib(n-2);
		}
		return sum;
	}
}
