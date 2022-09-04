package com.iller;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Bursa");
		list.add("Erzurum");
		list.add("Antalya");
		list.add("Ankara");
		list.add("Artvin");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).startsWith("An")) {
				list.add(i + 1, "--------");
			}

		}
		for (String string : list) {
			System.out.println(string);
		}

	}
}
