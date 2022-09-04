package com.bilgeadam.lesson002;

public class q23_06_16 {

	public static void main(String[] args) {
		String string = "Hayat,kisa,kuslar,ucuyor";
		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ',') {
				System.out.println(string.substring(index, i));
				index = i + 1;
			}

		}
		System.out.println(string.substring(index));
	}
}
