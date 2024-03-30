package com.number;

public class PrimeNumberCountInHundred {

	public static void main(String[] args) {

		int count = 0;

		for (int n = 2; n <= 100; n++) {
			boolean flag = true;

			for (int i = 2; i <= n / 2; i++) {

				if (n % i == 0) {
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.print(n + " , ");
				++count;
			}

		}
		System.out.println("\nCount : " + count);

	}
}
