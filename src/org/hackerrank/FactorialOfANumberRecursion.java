package org.hackerrank;

public class FactorialOfANumberRecursion {

	public static void main(String[] args) {
		int N = 5;
		System.out.println(fact(N));
	}

	public static int fact(int n) {
		int factorial = 1;
		if (n == 0) {
			return factorial;
		} else {
			factorial = n * fact(n - 1);
		}

		return factorial;
	}
}
