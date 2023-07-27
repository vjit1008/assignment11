package com.assignment11;

public class answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, -2, -3, -4, -5 };
		System.out.print(Sum(arr, 0));
	}

	public static int Sum(int[] arr, int i) {
		if (i == arr.length - 1)
		
			return arr[i];
		
		else
		
			return arr[i] + Sum(arr, i + 1);
		
	}

}
