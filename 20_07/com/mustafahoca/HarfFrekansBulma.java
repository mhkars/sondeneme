package com.mustafahoca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansBulma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> frekansMap = new HashMap<>();

		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);
			if (frekansMap.containsKey(c)) {
				frekansMap.replace(c, frekansMap.get(c) + 1);
			} else {
				frekansMap.put(c, 1);
			}
		}

		frekansMap.entrySet().forEach(System.out::println);

	}

}
