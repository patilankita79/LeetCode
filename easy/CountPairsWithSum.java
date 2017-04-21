package com.problems.easy;

import java.util.Scanner;

/**
 * A problem from geeksforgeeks
 * Problem : Count pairs with given sum
 * Given an array of integers, and a number ‘sum’, 
 * find the number of pairs of integers in the array whose sum is equal to ‘sum’.
 * @author Ankita Patil
 *
 */
public class CountPairsWithSum {
	
	public static void findPairs(int input[], int sum){
		
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j <input.length; j++) {
				if (input [i] + input[j] == sum)
					count ++;
			}
			
		}
		System.out.println("The count of number of pairs = " +count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array"); 
		int n = src.nextInt();
		int input[] = new int[n];
		System.out.println("Enter an array");
		for (int i = 0; i < input.length; i++ ) {
			input[i] = src.nextInt();
		}
		System.out.println("Enter the sum");
		int sum = src.nextInt();
		findPairs(input, sum);
	}

}
