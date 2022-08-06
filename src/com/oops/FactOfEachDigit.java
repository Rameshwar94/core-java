package com.oops;

import java.util.Scanner;

public class FactOfEachDigit {
	int count = 0;
	int fact1 ;

	public void digitFactorial(int a) {
		int k = a;
		int n=a;
		while (k > 0) {
			count++;
			k = k / 10;
		}
		System.out.println("count:" + (count - 1));
		int factorial[] = new int[count];
		int cnt = 0;
		while (a > 0) {
			int m = a % 10;
			int fact = 1;
			for (int i = m; i >= 1; i--) {
				fact = fact * i;
				fact1 = fact;
			}
			a = a / 10;
			factorial[cnt] = fact1;
			cnt++;
		}
		System.out.println("Factorial of all digit from entered number: "+n);
		for (int x = factorial.length - 1; x >= 0; x--) {
			System.out.print(factorial[x]+ "\t");
		}
	}

	public static void main(String[] args) {
		FactOfEachDigit f = new FactOfEachDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		int n = sc.nextInt();
		if (n > 32767) {
			System.out.println("No. is too Large, Please Re-Enter number within limit(32767)");
		} else if (n < 0) {
			System.out.println("Entered number is smaller than 0, Please Re-Enter number which is greater than 0");
		} else {
			f.digitFactorial(n);
		}

	}
}
