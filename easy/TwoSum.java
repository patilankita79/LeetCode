package com.problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Problem 1: Two sum
 * Given an array of integers, return indices of the two numbers such that
 *  they add up to a specific target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Example
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * @author Ankita Patil
 *
 */

public class TwoSum {
	
	public static int[] calculateIndex(int nums[], int target) {
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			//key is the array value
			//value is index
			m.put(nums[i], i);
		}
		
		for (int i = 0; i < nums.length; i++) {
			
			int a = target - nums[i];
			
			if (m.containsKey(a) && m.get(a) != i) {
				return new int[] {i, m.get(a)};
				
			}
		}
		throw new IllegalArgumentException("No two solution");		
			
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int nums[] = {2, 7, 11, 15};
//		int target = 9;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number of elements in an array");
		int n = src.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter the "+n+" elements of an array");
		for (int i = 0; i < nums.length ; i++) {
			nums[i] = src.nextInt(); 
		}
		System.out.println("Enter the target");
		int target = src.nextInt();
		int output[] = TwoSum.calculateIndex(nums, target);
		System.out.println(Arrays.toString(output));
		

	}

}
