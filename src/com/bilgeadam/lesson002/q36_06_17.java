package com.bilgeadam.lesson002;

public class q36_06_17 {

	public static void main(String[] args) {
		int start = 2;
		int end = 22;
		String[] array = new String[end - start];

		for (int i = 0; i < (end - start); i++) {
			if ((start + i) % 3 == 0 && (start + i) % 5 == 0)
				array[i] = "bilge adam";
			else if ((start + i) % 3 == 0)
				array[i] = "bilge";
			else if ((start + i) % 5 == 0)
				array[i] = "adam";
			else
				array[i] = start + i + "";
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}
}