package day1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value ");
		int pos = sc.nextInt();
		int res = fib(pos);
		System.out.println(res);
	}

	
	//using iteration :
	public static int fib(int pos) {

		int a = 2;
		int b = 3;
		int c = 0;
		for (int i = 2; i <= pos; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
}
