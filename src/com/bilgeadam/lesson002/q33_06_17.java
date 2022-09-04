package com.bilgeadam.lesson002;

public class q33_06_17 {

	public static void main(String[] args) {
		int[] nums = { 1, 13, 13, 5, 1, 1 };
		int i;
		int total = 0;

		for (i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {

				i = i + 1;
			} else {
				total += nums[i];
			}

		}
		System.out.println(total);
	}
}