package CSCI2020;

import java.util.Arrays;

public class FibDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fib series: 0,1,1,2,3,5,8,13,21,34,55
		
		FibonacciNumber fibObj = new FibonacciNumber();
		final int N = 25; 
		long fibMem[] = new long[N+1];
		Arrays.fill(fibMem, -1);
		System.out.println("Fib Number usig optimum algorithm: " + fibObj.fibOpt(N, fibMem));
		System.out.println("Fib Number: " + fibObj.fib(N));
	}

}
