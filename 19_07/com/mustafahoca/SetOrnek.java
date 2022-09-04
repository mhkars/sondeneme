package com.mustafahoca;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String kelime = sc.nextLine();
		Set<Character> tekSet = new HashSet<Character>();
		Set<Character> cokSet = new HashSet<Character>();

		for (int i = 0; i < kelime.length(); i++) {
			if (!cokSet.contains(kelime.charAt(i)) && !tekSet.add(kelime.charAt(i))) {
				cokSet.add(kelime.charAt(i));
				tekSet.remove(kelime.charAt(i));

			}

		}
		tekSet.forEach(s -> System.out.println(s));
		System.out.println();
		cokSet.forEach(s -> System.out.println(s));
	}
}
