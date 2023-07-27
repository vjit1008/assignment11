package com.assignment11;

import java.util.Scanner;

public class answer2 {
	public static int count(int num) {

		if (num < 10) {
			return 1;
		} else {

			return 1 + count(num /10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int p = count(n);
		System.out.println(p);
	}
}
