package com.assignment11;
//refer by Sonam Pathan
import java.util.*;


public class answer3 {

	
	    public static void permutations(char arr[], int fi) {
	        if (fi == arr.length - 1) {
	           
	            System.out.println(arr);
	            return;
	        }

	        for (int i = fi; i < arr.length; i++) {
	            swap(arr, i, fi);
	            permutations(arr, fi + 1);
	            swap(arr, i, fi);
	        }
	    }

	    private static void swap(char[] arr, int i, int fi) {
	        char temp = arr[i];
	        arr[i] = arr[fi];
	        arr[fi] = temp;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String s = sc.nextLine();
	        char p[] = s.toCharArray();
	        permutations(p, 0);
	    }
	}


