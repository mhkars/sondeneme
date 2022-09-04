package com.iller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IntegerArrayList {
	static Random random = new Random();

	public static void main(String[] args) {

		List<Integer> ciftList = new ArrayList<Integer>();
		List<Integer> tekList = new ArrayList<Integer>();

		for (int i = 0; i < 35; i++) {
			int num = random.nextInt(100);
			if (num % 2 == 0)
				ciftList.add(num);
			else {
				tekList.add(num);
			}
		}
		for (int integer : tekList) {
			System.out.print(integer + ",");
		}
		System.out.println();
		for (int integer : ciftList) {
			System.out.print(integer + ",");
		}

	}
}
