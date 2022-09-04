package com.para;

import java.util.Stack;

public class ParaSayma {

	public static void main(String[] args) {
		int total = 0;
		Stack<Integer> money = new Stack<Integer>();
		Stack<Integer> newMoney = new Stack<Integer>();
		money.add(5);
		money.add(10);
		money.add(20);
		money.add(50);
		money.add(100);
		money.add(200);

//		money.forEach(s -> System.out.print((s) + ","));
//
//		for (int i = (money.size() - 1); i > 0; i--) {
//			money.pop(i);
//			money.forEach(s -> System.out.print((s) + ","));

//		}
		while (money.isEmpty() == false) {

			if (money.peek() < 100) {

				total += money.pop();
			} else {
				newMoney.add(money.pop());
			}
		}
		System.out.println(total);
		newMoney.forEach(s -> System.out.print((s) + ","));
	}
}
